/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.net;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import org.apache.logging.log4j.core.d.n;
import org.apache.logging.log4j.d;

public class v
implements org.apache.logging.log4j.core.net.d {
    protected static final d a = org.apache.logging.log4j.d.d.k();
    private static Object b = v.c();
    private static Class c;
    private static Class d;

    @Override
    public Object a(Map map) {
        Map.Entry entry2;
        HashMap hashMap = new HashMap();
        for (Map.Entry entry2 : map.entrySet()) {
            if (((String)entry2.getKey()).length() > 255 || ((String)entry2.getValue()).length() > 255) continue;
            hashMap.put(entry2.getKey(), entry2.getValue());
        }
        String string = (String)hashMap.get("protocol");
        entry2 = "._log4j._" + (String)(string != null ? string : "tcp") + ".local.";
        String string2 = (String)hashMap.get("port");
        int n2 = n.a(string2, 4555);
        String string3 = (String)hashMap.get("name");
        if (b != null) {
            boolean bl2 = false;
            try {
                c.getMethod("create", null);
                bl2 = true;
            }
            catch (NoSuchMethodException noSuchMethodException) {
                // empty catch block
            }
            Object object = bl2 ? this.b((String)((Object)entry2), n2, string3, hashMap) : this.a((String)((Object)entry2), n2, string3, hashMap);
            try {
                Method method = c.getMethod("registerService", d);
                method.invoke(b, object);
            }
            catch (IllegalAccessException illegalAccessException) {
                a.f("Unable to invoke registerService method", (Throwable)illegalAccessException);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                a.f("No registerService method", (Throwable)noSuchMethodException);
            }
            catch (InvocationTargetException invocationTargetException) {
                a.f("Unable to invoke registerService method", (Throwable)invocationTargetException);
            }
            return object;
        }
        a.f("JMDNS not available - will not advertise ZeroConf support");
        return null;
    }

    @Override
    public void a(Object object) {
        if (b != null) {
            try {
                Method method = c.getMethod("unregisterService", d);
                method.invoke(b, object);
            }
            catch (IllegalAccessException illegalAccessException) {
                a.f("Unable to invoke unregisterService method", (Throwable)illegalAccessException);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                a.f("No unregisterService method", (Throwable)noSuchMethodException);
            }
            catch (InvocationTargetException invocationTargetException) {
                a.f("Unable to invoke unregisterService method", (Throwable)invocationTargetException);
            }
        }
    }

    private static Object a() {
        try {
            return c.newInstance();
        }
        catch (InstantiationException instantiationException) {
            a.f("Unable to instantiate JMDNS", (Throwable)instantiationException);
        }
        catch (IllegalAccessException illegalAccessException) {
            a.f("Unable to instantiate JMDNS", (Throwable)illegalAccessException);
        }
        return null;
    }

    private static Object b() {
        try {
            Method method = c.getMethod("create", null);
            return method.invoke(null, null);
        }
        catch (IllegalAccessException illegalAccessException) {
            a.f("Unable to instantiate jmdns class", (Throwable)illegalAccessException);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            a.f("Unable to access constructor", (Throwable)noSuchMethodException);
        }
        catch (InvocationTargetException invocationTargetException) {
            a.f("Unable to call constructor", (Throwable)invocationTargetException);
        }
        return null;
    }

    private Object a(String string, int n2, String string2, Map map) {
        Hashtable hashtable = new Hashtable(map);
        try {
            Class[] arrclass = new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Hashtable.class};
            Constructor constructor = d.getConstructor(arrclass);
            Object[] arrobject = new Object[]{string, string2, n2, 0, 0, hashtable};
            return constructor.newInstance(arrobject);
        }
        catch (IllegalAccessException illegalAccessException) {
            a.f("Unable to construct ServiceInfo instance", (Throwable)illegalAccessException);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            a.f("Unable to get ServiceInfo constructor", (Throwable)noSuchMethodException);
        }
        catch (InstantiationException instantiationException) {
            a.f("Unable to construct ServiceInfo instance", (Throwable)instantiationException);
        }
        catch (InvocationTargetException invocationTargetException) {
            a.f("Unable to construct ServiceInfo instance", (Throwable)invocationTargetException);
        }
        return null;
    }

    private Object b(String string, int n2, String string2, Map map) {
        try {
            Class[] arrclass = new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Map.class};
            Method method = d.getMethod("create", arrclass);
            Object[] arrobject = new Object[]{string, string2, n2, 0, 0, map};
            return method.invoke(null, arrobject);
        }
        catch (IllegalAccessException illegalAccessException) {
            a.f("Unable to invoke create method", (Throwable)illegalAccessException);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            a.f("Unable to find create method", (Throwable)noSuchMethodException);
        }
        catch (InvocationTargetException invocationTargetException) {
            a.f("Unable to invoke create method", (Throwable)invocationTargetException);
        }
        return null;
    }

    private static Object c() {
        try {
            c = Class.forName("javax.jmdns.JmDNS");
            d = Class.forName("javax.jmdns.ServiceInfo");
            boolean bl2 = false;
            try {
                c.getMethod("create", null);
                bl2 = true;
            }
            catch (NoSuchMethodException noSuchMethodException) {
                // empty catch block
            }
            if (bl2) {
                return v.b();
            }
            return v.a();
        }
        catch (ClassNotFoundException classNotFoundException) {
            a.f("JmDNS or serviceInfo class not found", (Throwable)classNotFoundException);
        }
        catch (ExceptionInInitializerError exceptionInInitializerError) {
            a.f("JmDNS or serviceInfo class not found", (Throwable)exceptionInInitializerError);
        }
        return null;
    }
}

