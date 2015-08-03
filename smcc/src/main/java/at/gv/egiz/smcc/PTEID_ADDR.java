package at.gv.egiz.smcc;

import java.util.LinkedHashMap;
import java.util.Map;

public class PTEID_ADDR {

    //EF05 ADDRESS
    // shared address attributes
    private static final short ADDRESS_TYPE_OFFSET = 0x0;
    private static final short ADDRESS_COUNTRY_OFFSET = 0x2;
    // national address attribute offsets
    private static final short DISTRICT_CODE_OFFSET = 0x6;
    private static final short DISTRICT_DESCRIPTION_OFFSET = 0xA;
    private static final short MUNICIPALITY_CODE_OFFSET = 0x6E;
    private static final short MUNICIPALITY_DESCRIPTION_OFFSET = 0x76;//corrected to 0x76 original value 0x75 had a '0' char and return empry string
    private static final short CIVIL_PARISH_CODE_OFFSET = 0xDA;
    private static final short CIVIL_PARISH_DESCRIPTION_OFFSET = 0xE6;
    private static final short ABBR_STREET_TYPE_OFFSET = 0x14A;
    private static final short STREET_TYPE_OFFSET = 0x15E;
    private static final short STREET_NAME_OFFSET = 0x1C2;
    private static final short ABBR_BUILDING_TYPE_OFFSET = 0x28A;
    private static final short BUILDING_TYPE_OFFSET = 0x29E;
    private static final short DOOR_NUMBER_OFFSET = 0x302;
    private static final short FLOOR_OFFSET = 0x316;
    private static final short SIDE_OFFSET = 0x33E;
    private static final short PLACE_OFFSET = 0x366;
    private static final short LOCALITY_OFFSET = 0x3CA;
    private static final short POSTAL_CODE_CP4_OFFSET = 0x42E;
    private static final short POSTAL_CODE_CP3_OFFSET = 0x436;
    private static final short POSTAL_LOCALITY_OFFSET = 0x43C;
    private static final short ADDRESS_NUMBER_OFFSET = 0x46E;
    // foreign address attribute offsets
    private static final short FOREIGN_COUNTRY_DESCRIPTION_OFFSET = 0x6;
    private static final short FOREIGN_ADDRESS_OFFSET = 0x6A;
    private static final short FOREIGN_CITY_OFFSET = 0x196;
    private static final short FOREIGN_REGION_OFFSET = 0x1FA;
    private static final short FOREIGN_LOCALITY_OFFSET = 0x25E;
    private static final short FOREIGN_POSTAL_CODE_OFFSET = 0x2C2;
    private static final short FOREIGN_ADDRESS_NUMBER_OFFSET = 0x326;
    /* Fields length */
    private static final short PTEID_ADDR_TYPE_LEN = 2;
    private static final short PTEID_ADDR_COUNTRY_LEN = 4;
    private static final short PTEID_DISTRICT_LEN = 4;
    private static final short PTEID_DISTRICT_DESC_LEN = 100;
    private static final short PTEID_DISTRICT_CON_LEN = 8;
    private static final short PTEID_DISTRICT_CON_DESC_LEN = 100;
    private static final short PTEID_DISTRICT_FREG_LEN = 12;
    private static final short PTEID_DISTRICT_FREG_DESC_LEN = 100;
    private static final short PTEID_ROAD_ABBR_LEN = 20;
    private static final short PTEID_ROAD_LEN = 100;
    private static final short PTEID_ROAD_DESIG_LEN = 200;
    private static final short PTEID_HOUSE_ABBR_LEN = 20;
    private static final short PTEID_HOUSE_LEN = 100;
    private static final short PTEID_NUMDOOR_LEN = 20;
    private static final short PTEID_FLOOR_LEN = 40;
    private static final short PTEID_SIDE_LEN = 40;
    private static final short PTEID_PLACE_LEN = 100;
    private static final short PTEID_LOCALITY_LEN = 100;
    private static final short PTEID_CP4_LEN = 8;
    private static final short PTEID_CP3_LEN = 6;
    private static final short PTEID_POSTAL_LEN = 50;
    private static final short PTEID_NUMMOR_LEN = 12;
    private static final short PTEID_ADDR_COUNTRYF_DESC_LEN = 100;
    private static final short PTEID_ADDRF_LEN = 300;
    private static final short PTEID_CITYF_LEN = 100;
    private static final short PTEID_REGIOF_LEN = 100;
    private static final short PTEID_LOCALITYF_LEN = 100;
    private static final short PTEID_POSTALF_LEN = 100;
    private static final short PTEID_NUMMORF_LEN = 12;
    
    private static final String ADDR_TYPE_NATIONAL = "N";
    
    public short version;
    public String addrType;
    public String country;
    public String district;
    public String districtDesc;
    public String municipality;
    public String municipalityDesc;
    public String freguesia;
    public String freguesiaDesc;
    public String streettypeAbbr;
    public String streettype;
    public String street;
    public String buildingAbbr;
    public String building;
    public String door;
    public String floor;
    public String side;
    public String place;
    public String locality;
    public String cp4;
    public String cp3;
    public String postal;
    public String numMor;
    public String countryDescF;
    public String addressF;
    public String cityF;
    public String regioF;
    public String localityF;
    public String postalF;
    public String numMorF;

    public static PTEID_ADDR parseAddr(byte[] buf) {

        PTEID_ADDR addr = new PTEID_ADDR();

        addr.addrType = Utils.extractString(buf, ADDRESS_TYPE_OFFSET, PTEID_ADDR_TYPE_LEN);
        addr.country = Utils.extractString(buf, ADDRESS_COUNTRY_OFFSET, PTEID_ADDR_COUNTRY_LEN);

        // check if the address is national it can be checked by addrType or by country
        if (ADDR_TYPE_NATIONAL.equals(addr.addrType)) {
            addr.district = Utils.extractString(buf, DISTRICT_CODE_OFFSET, PTEID_DISTRICT_LEN);
            addr.districtDesc = Utils.extractString(buf, DISTRICT_DESCRIPTION_OFFSET, PTEID_DISTRICT_DESC_LEN);
            addr.municipality = Utils.extractString(buf, MUNICIPALITY_CODE_OFFSET, PTEID_DISTRICT_CON_LEN);
            addr.municipalityDesc = Utils.extractString(buf, MUNICIPALITY_DESCRIPTION_OFFSET, PTEID_DISTRICT_CON_DESC_LEN);
            addr.freguesia = Utils.extractString(buf, CIVIL_PARISH_CODE_OFFSET, PTEID_DISTRICT_FREG_LEN);
            addr.freguesiaDesc = Utils.extractString(buf, CIVIL_PARISH_DESCRIPTION_OFFSET, PTEID_DISTRICT_FREG_DESC_LEN);
            addr.streettypeAbbr = Utils.extractString(buf, ABBR_STREET_TYPE_OFFSET, PTEID_ROAD_ABBR_LEN);
            addr.streettype = Utils.extractString(buf, STREET_TYPE_OFFSET, PTEID_ROAD_LEN);
            addr.street = Utils.extractString(buf, STREET_NAME_OFFSET, PTEID_ROAD_DESIG_LEN);
            addr.buildingAbbr = Utils.extractString(buf, ABBR_BUILDING_TYPE_OFFSET, PTEID_HOUSE_ABBR_LEN);
            addr.building = Utils.extractString(buf, BUILDING_TYPE_OFFSET, PTEID_HOUSE_LEN);
            addr.door = Utils.extractString(buf, DOOR_NUMBER_OFFSET, PTEID_NUMDOOR_LEN);
            addr.floor = Utils.extractString(buf, FLOOR_OFFSET, PTEID_FLOOR_LEN);
            addr.side = Utils.extractString(buf, SIDE_OFFSET, PTEID_SIDE_LEN);
            addr.place = Utils.extractString(buf, PLACE_OFFSET, PTEID_PLACE_LEN);
            addr.locality = Utils.extractString(buf, LOCALITY_OFFSET, PTEID_LOCALITY_LEN);
            addr.cp4 = Utils.extractString(buf, POSTAL_CODE_CP4_OFFSET, PTEID_CP4_LEN);
            addr.cp3 = Utils.extractString(buf, POSTAL_CODE_CP3_OFFSET, PTEID_CP3_LEN);
            addr.postal = Utils.extractString(buf, POSTAL_LOCALITY_OFFSET, PTEID_POSTAL_LEN);
            addr.numMor = Utils.extractString(buf, ADDRESS_NUMBER_OFFSET, PTEID_NUMMOR_LEN);

        } else { // foreign address
            addr.countryDescF = Utils.extractString(buf, FOREIGN_COUNTRY_DESCRIPTION_OFFSET, PTEID_ADDR_COUNTRYF_DESC_LEN);
            addr.addressF = Utils.extractString(buf, FOREIGN_ADDRESS_OFFSET, PTEID_ADDRF_LEN);
            addr.cityF = Utils.extractString(buf, FOREIGN_CITY_OFFSET, PTEID_CITYF_LEN);
            addr.regioF = Utils.extractString(buf, FOREIGN_REGION_OFFSET, PTEID_REGIOF_LEN);
            addr.localityF = Utils.extractString(buf, FOREIGN_LOCALITY_OFFSET, PTEID_LOCALITYF_LEN);
            addr.postalF = Utils.extractString(buf, FOREIGN_POSTAL_CODE_OFFSET, PTEID_POSTALF_LEN);
            addr.numMorF = Utils.extractString(buf, FOREIGN_ADDRESS_NUMBER_OFFSET, PTEID_NUMMORF_LEN);
        }

        return addr;
    }

    @Override
    public String toString() {
        return "PTEID_ADDR{" + "version=" + version + ", addrType=" + addrType + ", country=" + country + ", district=" + district + ", districtDesc=" + districtDesc + ", municipality=" + municipality + ", municipalityDesc=" + municipalityDesc + ", freguesia=" + freguesia + ", freguesiaDesc=" + freguesiaDesc + ", streettypeAbbr=" + streettypeAbbr + ", streettype=" + streettype + ", street=" + street + ", buildingAbbr=" + buildingAbbr + ", building=" + building + ", door=" + door + ", floor=" + floor + ", side=" + side + ", place=" + place + ", locality=" + locality + ", cp4=" + cp4 + ", cp3=" + cp3 + ", postal=" + postal + ", numMor=" + numMor + ", countryDescF=" + countryDescF + ", addressF=" + addressF + ", cityF=" + cityF + ", regioF=" + regioF + ", localityF=" + localityF + ", postalF=" + postalF + ", numMorF=" + numMorF + '}';
    }

    public Map<String, String> getAllInfo() {
        return new LinkedHashMap<String, String>() {
            {
                put("version", String.valueOf(version));
                put("addrType", addrType);
                put("country", country);
                put("district", district);
                put("districtDesc", districtDesc);
                put("municipality", municipality);
                put("municipalityDesc", municipalityDesc);//TODO: check if this is being gathered correclty: got empty string for two PTEID cards
                put("freguesia", freguesia);
                put("freguesiaDesc", freguesiaDesc);
                put("streettypeAbbr", streettypeAbbr);
                put("streettype", streettype);
                put("street", street);
                put("buildingAbbr", buildingAbbr);
                put("building", building);
                put("door", door);
                put("floor", floor);
                put("side", side);
                put("place", place);
                put("locality", locality);
                put("cp4", cp4);
                put("cp3", cp3);
                put("postal", postal);
                put("numMor", numMor);

                put("countryDescF", countryDescF);
                put("addressF", addressF);
                put("cityF", cityF);
                put("regioF", regioF);
                put("localityF", localityF);
                put("postalF", postalF);
                put("numMorF", numMorF);
            }
        };
    }
    
    public Map<String, String>  getCMPombalInfo() {
        return getAllInfo();
    }
    
}
