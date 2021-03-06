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


package at.gv.egiz.smcc.pin.gui;

import at.gv.egiz.smcc.CancelledException;
import at.gv.egiz.smcc.PinInfo;


/**
 * Display messages for pinpad pin-entry.
 * Provides an interface for two types of pinpad pin-entry: pinpad-direct and pinpad-start/finish
 * @author clemens.orthacker@iaik.tugraz.at
 */
public interface PINGUI extends PINProvider {

  void enterPINDirect(PinInfo pinInfo, int retries)
          throws CancelledException, InterruptedException;
  
  /**
   * @throws CancelledException, InterruptedException if signature-data dialog is interrupted or cancelled
   */
  void enterPIN(PinInfo pinInfo, int retries)
          throws CancelledException, InterruptedException;
  void validKeyPressed();
  void correctionButtonPressed();
  void allKeysCleared();
  
}
