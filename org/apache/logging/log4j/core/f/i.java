/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.f;

import java.lang.management.ManagementFactory;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.management.MBeanServer;
import javax.management.ObjectName;
import org.apache.logging.log4j.core.b;
import org.apache.logging.log4j.core.config.v;
import org.apache.logging.log4j.core.f.a;
import org.apache.logging.log4j.core.f.c;
import org.apache.logging.log4j.core.f.e;
import org.apache.logging.log4j.core.f.g;
import org.apache.logging.log4j.core.f.j;
import org.apache.logging.log4j.core.f.k;
import org.apache.logging.log4j.d.d;

public final class i {
    private static final String a = "log4j2.disable.jmx";

    private i() {
    }

    public static String a(String string) {
        StringBuilder stringBuilder = new StringBuilder(string.length() * 2);
        boolean bl2 = false;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            switch (c2) {
                case '*': 
                case ',': 
                case ':': 
                case '=': 
                case '?': 
                case '\\': {
                    stringBuilder.append('\\');
                    bl2 = true;
                }
            }
            stringBuilder.append(c2);
        }
        if (bl2) {
            stringBuilder.insert(0, '\"');
            stringBuilder.append('\"');
        }
        return stringBuilder.toString();
    }

    public static void a(org.apache.logging.log4j.core.j.e e2) {
        if (Boolean.getBoolean(a)) {
            d.k().a("JMX disabled for log4j2. Not registering MBeans.");
            return;
        }
        MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
        i.a(e2, mBeanServer);
    }

    public static void a(org.apache.logging.log4j.core.j.e e2, MBeanServer mBeanServer) {
        if (Boolean.getBoolean(a)) {
            d.k().a("JMX disabled for log4j2. Not registering MBeans.");
            return;
        }
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        i.a(mBeanServer, executorService);
        i.a(e2, mBeanServer, (Executor)executorService);
        List list = e2.a();
        i.a(list, mBeanServer, (Executor)executorService);
        for (org.apache.logging.log4j.core.k k2 : list) {
            k2.a(new j(k2, mBeanServer, executorService));
        }
    }

    private static void a(MBeanServer mBeanServer, Executor executor) {
        k k2 = new k(executor);
        mBeanServer.registerMBean(k2, k2.e());
    }

    private static void a(org.apache.logging.log4j.core.j.e e2, MBeanServer mBeanServer, Executor executor) {
        c c2 = new c(e2);
        mBeanServer.registerMBean(c2, c2.a());
    }

    private static void a(List list, MBeanServer mBeanServer, Executor executor) {
        for (org.apache.logging.log4j.core.k k2 : list) {
            g g2 = new g(k2, executor);
            mBeanServer.registerMBean(g2, g2.j());
        }
    }

    private static void c(org.apache.logging.log4j.core.k k2, MBeanServer mBeanServer) {
        String string = "org.apache.logging.log4j2:type=LoggerContext,ctx=%s,sub=LoggerConfig,name=%s";
        String string2 = String.format("org.apache.logging.log4j2:type=LoggerContext,ctx=%s,sub=LoggerConfig,name=%s", k2.a(), "*");
        i.a(string2, mBeanServer);
    }

    private static void d(org.apache.logging.log4j.core.k k2, MBeanServer mBeanServer) {
        String string = "org.apache.logging.log4j2:type=LoggerContext,ctx=%s,sub=Appender,name=%s";
        String string2 = String.format("org.apache.logging.log4j2:type=LoggerContext,ctx=%s,sub=Appender,name=%s", k2.a(), "*");
        i.a(string2, mBeanServer);
    }

    private static void a(String string, MBeanServer mBeanServer) {
        try {
            ObjectName objectName = new ObjectName(string);
            Set<ObjectName> set = mBeanServer.queryNames(objectName, null);
            for (ObjectName objectName2 : set) {
                mBeanServer.unregisterMBean(objectName2);
            }
        }
        catch (Exception exception) {
            d.k().b("Could not unregister " + string, (Throwable)exception);
        }
    }

    private static void c(org.apache.logging.log4j.core.k k2, MBeanServer mBeanServer, Executor executor) {
        Map map = k2.d().p();
        for (String string : map.keySet()) {
            v v2 = (v)map.get(string);
            e e2 = new e(k2.a(), v2);
            mBeanServer.registerMBean(e2, e2.a());
        }
    }

    private static void d(org.apache.logging.log4j.core.k k2, MBeanServer mBeanServer, Executor executor) {
        Map map = k2.d().k();
        for (String string : map.keySet()) {
            b b2 = (b)map.get(string);
            a a2 = new a(k2.a(), b2);
            mBeanServer.registerMBean(a2, a2.a());
        }
    }

    static /* synthetic */ void a(org.apache.logging.log4j.core.k k2, MBeanServer mBeanServer) {
        i.c(k2, mBeanServer);
    }

    static /* synthetic */ void b(org.apache.logging.log4j.core.k k2, MBeanServer mBeanServer) {
        i.d(k2, mBeanServer);
    }

    static /* synthetic */ void a(org.apache.logging.log4j.core.k k2, MBeanServer mBeanServer, Executor executor) {
        i.c(k2, mBeanServer, executor);
    }

    static /* synthetic */ void b(org.apache.logging.log4j.core.k k2, MBeanServer mBeanServer, Executor executor) {
        i.d(k2, mBeanServer, executor);
    }
}

