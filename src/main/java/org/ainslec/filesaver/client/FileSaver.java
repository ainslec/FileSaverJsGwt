/**
 * Copyright 2015 Chris Ainsley
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ainslec.filesaver.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Trivial wrapper around the FileSaverJS library ( https://github.com/eligrey/FileSaver.js/ )<br></br><br></br>
 * Allows modern web browsers to save Currently only supports saving as text, but will add more methods in later releases.
 * Original Library License (MIT) : https://github.com/eligrey/FileSaver.js/blob/master/LICENSE.md
 * @author Chris Ainsley
 *
 */
public class FileSaver {
   
	public native static void saveText(String fileName, String text) /*-{
		var textMessage = new Blob([text],{type: "text/plain;charset=utf-8"});
		$wnd.saveAs(textMessage, fileName);
	}-*/;
	

  public native static void saveBlob(String fileName, JavaScriptObject blob) /*-{
     $wnd.saveAs(blob, fileName);
  }-*/;

	
}
