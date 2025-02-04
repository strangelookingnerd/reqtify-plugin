/*
 * The MIT License
 *
 * Copyright 2020 Dassault SystÃ¨mes.
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
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package io.jenkins.plugins;

import java.util.HashMap;
import java.util.Map;

@edu.umd.cs.findbugs.annotations.SuppressFBWarnings("MS_SHOULD_BE_FINAL")
public class ReqtifyData {
    public static Utils utils = new Utils();
    public static Map<String, Process> reqtfyLanguageProcessMap = new HashMap<>();
    public static Map<String, Integer> reqtifyLanguagePortMap = new HashMap<>();
    public static String tempDir = System.getProperty("java.io.tmpdir");
    public static String reqtifyTimeoutValue = "1800";
    // public static String pluginEnv = "DEBUG";
    public static String pluginEnv = "RELEASE";

    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings("MS_PKGPROTECT")
    public static String cookie = "";
}
