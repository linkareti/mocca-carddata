/*
 * Copyright 2011 by Graz University of Technology, Austria
 * MOCCA has been developed by the E-Government Innovation Center EGIZ, a joint
 * initiative of the Federal Chancellery Austria and Graz University of Technology.
 *
 * Licensed under the EUPL, Version 1.1 or - as soon they will be approved by
 * the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 * http://www.osor.eu/eupl/
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and
 * limitations under the Licence.
 *
 * This product combines work with different licenses. See the "NOTICE" text
 * file for details on the various modules and licenses.
 * The "NOTICE" text file is part of the distribution. Any derivative works
 * that you distribute must include a readable copy of the "NOTICE" text file.
 */


package at.gv.egiz.bku.smccstal;

import at.gv.egiz.bku.gui.BKUGUIFacade;
import at.gv.egiz.smcc.SignatureCard;
import at.gv.egiz.smcc.util.SMCCHelper;
import at.gv.egiz.stal.ErrorResponse;
import at.gv.egiz.stal.STALRequest;
import at.gv.egiz.stal.STALResponse;
import at.gv.egiz.stal.StatusRequest;
import at.gv.egiz.stal.StatusResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Clemens Orthacker <clemens.orthacker@iaik.tugraz.at>
 */
public class StatusRequestHandler extends AbstractRequestHandler {

  private final Logger log = LoggerFactory.getLogger(StatusRequestHandler.class);

  @Override
  public void init(SignatureCard sc, BKUGUIFacade gui) {
    //nothing, avoid NullPointerEx since requireCard==false => sc==null
  }


  @Override
  public STALResponse handleRequest(STALRequest request) throws InterruptedException {

    if (request instanceof StatusRequest) {
      log.info("Handling STATUS request.");
      SMCCHelper smccHelper = new SMCCHelper();
      StatusResponse response = new StatusResponse();
      if (log.isTraceEnabled()) {
        log.trace("SMCC result code: {}, cardReady: {}.", smccHelper
            .getResultCode(),
            (smccHelper.getResultCode() == SMCCHelper.CARD_FOUND));
      }
      if (smccHelper.getResultCode() == SMCCHelper.CARD_FOUND) {
        response.setCardReady(Boolean.TRUE);
      } else {
        response.setCardReady(Boolean.FALSE);
      }
      return response;
    } else {
      log.error("Got unexpected STAL request: {}.", request);
      ErrorResponse err = new ErrorResponse(1000);
      err.setErrorMessage("Got unexpected STAL request: " + request);
      return err;
    }
  }

  @Override
  public boolean requireCard() {
    return false;
  }
}
