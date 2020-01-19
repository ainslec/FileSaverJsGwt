# FileSaverJsGwt

FileSaverJsGwt is a tiny and trivial GWT wrapper around filesaver.js library. The purpose of the library is to allow file downloads on the client side.

## Usage

1. Add the library to your classpath, either via jar, or via whatever build system you are familiar with.

2. Add the following line to your .gwt.xml file

>              <inherits name='org.ainslec.filesaver.FileSaver'/>

3. Use the FileSaver.saveText() or FileSaver.saveBlob() methods to save text or binary information to a file via the browser.

>              // To save as text
>              FileSaver.saveText(fileName, fileText);
>              // To save binary information
>              FileSaver.saveBlob(fileName, blob); // The blob must be a JavascriptObject representing a standard Blob object.

## Compatibility

Requires a modern version of IE (10+) or Firefox (25+) or Chrome or Safari (6.1+). See https://github.com/eligrey/FileSaver.js for more details.

## History 

* Version 0.1   - November 20, 2015 - Initial Release, saves text only, no binary save.
* Version 0.2   - September 22, 2016 - Added saveBlob() method, for saving files containing binary content.
* Version 1.0.0 - January 19, 2020 - Added Maven Central build, changed package name to org.ainslec.*.

## Licenses


The underlying library is statically linked into the library and is licensed under the MIT license.


> Copyright © 2015 Eli Grey
> 
> Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
> 
> The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
> 
> THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
> 

The wrapper is licensed under the Apache version 2.0 license.

> Copyright 2015 Chris Ainsley
> 
> Licensed under the Apache License, Version 2.0 (the "License");
> you may not use this file except in compliance with the License.
> You may obtain a copy of the License at
> 
> http://www.apache.org/licenses/LICENSE-2.0
> 
> Unless required by applicable law or agreed to in writing, software
> distributed under the License is distributed on an "AS IS" BASIS,
> WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
> See the License for the specific language governing permissions and
> limitations under the License.

## Acknowledgements

* Thanks for Colin Alworth for his help with entry point script injection.
* Thanks for Eli Grey for his library.
