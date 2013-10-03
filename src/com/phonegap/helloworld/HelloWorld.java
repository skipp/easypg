/*
       Licensed to the Apache Software Foundation (ASF) under one
       or more contributor license agreements.  See the NOTICE file
       distributed with this work for additional information
       regarding copyright ownership.  The ASF licenses this file
       to you under the Apache License, Version 2.0 (the
       "License"); you may not use this file except in compliance
       with the License.  You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

       Unless required by applicable law or agreed to in writing,
       software distributed under the License is distributed on an
       "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
       KIND, either express or implied.  See the License for the
       specific language governing permissions and limitations
       under the License.
 */

package com.phonegap.helloworld;

import android.os.Bundle;
import org.apache.cordova.*;

public class HelloWorld extends DroidGap
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        // Set by <content src="index.html" /> in config.xml
//        super.loadUrl(Config.getStartUrl());
        super.init();
        super.clearCache();
        super.clearHistory();
        super.appView.getSettings().setAppCacheEnabled(false);
        super.loadUrl("http://test3.easyfinance.ru/pda/");
//        super.loadUrl("http://google.com");
//        super.loadUrl("https://m.easyfinance.ru/index.php");
//        super.loadUrl("file:///android_asset/www/index.html");
    }
}

