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



package at.gv.egiz.bku.pin.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * common super class providing action listener for all PIN GUIs
 * @author Clemens Orthacker <clemens.orthacker@iaik.tugraz.at>
 */
public abstract class AbstractPINProvider implements ActionListener {

  private final Logger log = LoggerFactory.getLogger(AbstractPINProvider.class);

  protected String action;
  protected boolean actionPerformed;

  protected synchronized void waitForAction() throws InterruptedException {
    try {
      while (!actionPerformed) {
        this.wait();
      }
    } catch (InterruptedException e) {
      log.error("[{}] interrupt in waitForAction.", Thread.currentThread().getName());
      throw e;
    }
    actionPerformed = false;
  }

  private synchronized void actionPerformed() {
    actionPerformed = true;
    notify();//All();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    log.debug("[{}] action performed - {}", Thread.currentThread().getName(), e.getActionCommand());
    action = e.getActionCommand();
    actionPerformed();
  }
}
