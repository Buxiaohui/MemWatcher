/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.buxiaohui.qrc

class LogUtils {
    static boolean E = true
    static boolean I = true
    static boolean D = true

    static void logE(String log) {
        if (!E) {
            return
        }
        println(log)
    }

    static void logI(String log) {
        if (!I) {
            return
        }
        println(log)
    }

    static void logD(String log) {
        if (!D) {
            return
        }
        println(log)
    }
}
