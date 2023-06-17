/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.a;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.a.ab;
import org.apache.logging.log4j.a.af;
import org.apache.logging.log4j.a.c;

class ad
implements af {
    private ad() {
    }

    @Override
    public Map a() {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] arrthreadInfo = threadMXBean.dumpAllThreads(true, true);
        HashMap<c, StackTraceElement[]> hashMap = new HashMap<c, StackTraceElement[]>(arrthreadInfo.length);
        for (ThreadInfo threadInfo : arrthreadInfo) {
            hashMap.put(new c(threadInfo), threadInfo.getStackTrace());
        }
        return hashMap;
    }

    /* synthetic */ ad(ab ab2) {
        this();
    }
}

