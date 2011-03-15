/*
 * RDV
 * Real-time Data Viewer
 * http://rdv.googlecode.com/
 * 
 * Copyright (c) 2005-2007 University at Buffalo
 * Copyright (c) 2005-2007 NEES Cyberinfrastructure Center
 * Copyright (c) 2008 Palta Software
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 * 
 * $URL: https://rdv.googlecode.com/svn/branches/RDV-1.9/src/org/nees/central/CentralException.java $
 * $Revision: 1149 $
 * $Date: 2008-07-03 10:23:04 -0400 (Thu, 03 Jul 2008) $
 * $Author: jason@paltasoftware.com $
 */

package org.nees.central;

/**
 * An exception for the NEEScentral client.
 * 
 * @author Jason P. Hanley
 */
public class CentralException extends Exception {

  /** serialization version identifier */
  private static final long serialVersionUID = 3650125725823342231L;

  /**
   * Creates the exception with the given message.
   * 
   * @param message  the exception message
   */
  public CentralException(String message) {
    this(message, null);
  }

  /**
   * Creates the exception with the given throwable as the cause.
   * 
   * @param cause  the cause of the exception
   */
  public CentralException(Throwable cause) {
    this(null, cause);
  }

  /**
   * Creates the exception with the given message and with the given throwable
   * as the cause.
   *  
   * @param message  the exception message
   * @param cause    the cause of the exception
   */
  public CentralException(String message, Throwable cause) {
    super(message, cause);
  }
}