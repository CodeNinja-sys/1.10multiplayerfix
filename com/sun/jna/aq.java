/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.Native;
import com.sun.jna.ar;
import com.sun.jna.as;
import com.sun.jna.ax;
import com.sun.jna.ay;
import com.sun.jna.n;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class aq {
    private long d;
    private final String e;
    private final String f;
    private final Map g = new HashMap();
    final int a;
    final Map b;
    private static final Map h = new HashMap();
    private static final Map i = Collections.synchronizedMap(new HashMap());
    private static final List j = new LinkedList();
    static Class c;

    private static String b(String string, int n2) {
        return string + "|" + n2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private aq(String string, String string2, long l2, Map map) {
        int n2;
        this.e = this.h(string);
        this.f = string2;
        this.d = l2;
        Object v2 = map.get("calling-convention");
        this.a = n2 = v2 instanceof Integer ? (Integer)v2 : 0;
        this.b = map;
        if (ax.e() && "kernel32".equals(this.e.toLowerCase())) {
            Map map2 = this.g;
            synchronized (map2) {
                ar ar2 = new ar(this, this, "GetLastError", 1);
                this.g.put(aq.b("GetLastError", this.a), ar2);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static aq b(String string, Map map) {
        long l2;
        Object object;
        block23: {
            List list;
            LinkedList<String> linkedList = new LinkedList<String>();
            String string2 = Native.d(string);
            if (string2 != null) {
                linkedList.add(string2);
            }
            if ((list = (List)i.get(string)) != null) {
                object = list;
                synchronized (object) {
                    linkedList.addAll(0, list);
                }
            }
            linkedList.addAll(aq.i("jna.library.path"));
            object = aq.b(string, linkedList);
            l2 = 0L;
            try {
                l2 = Native.open((String)object);
            }
            catch (UnsatisfiedLinkError unsatisfiedLinkError) {
                linkedList.addAll(j);
            }
            try {
                if (l2 == 0L && (l2 = Native.open((String)(object = aq.b(string, linkedList)))) == 0L) {
                    throw new UnsatisfiedLinkError("Failed to load library '" + string + "'");
                }
            }
            catch (UnsatisfiedLinkError unsatisfiedLinkError) {
                UnsatisfiedLinkError unsatisfiedLinkError2;
                if (ax.c()) {
                    object = aq.a(string, linkedList);
                    if (object != null) {
                        try {
                            l2 = Native.open((String)object);
                        }
                        catch (UnsatisfiedLinkError unsatisfiedLinkError3) {
                            unsatisfiedLinkError2 = unsatisfiedLinkError3;
                        }
                    }
                } else if (ax.b() && !string.endsWith(".dylib")) {
                    object = "/System/Library/Frameworks/" + string + ".framework/" + string;
                    if (new File((String)object).exists()) {
                        try {
                            l2 = Native.open((String)object);
                        }
                        catch (UnsatisfiedLinkError unsatisfiedLinkError4) {
                            unsatisfiedLinkError2 = unsatisfiedLinkError4;
                        }
                    }
                } else if (ax.e()) {
                    object = aq.b("lib" + string, linkedList);
                    try {
                        l2 = Native.open((String)object);
                    }
                    catch (UnsatisfiedLinkError unsatisfiedLinkError5) {
                        unsatisfiedLinkError2 = unsatisfiedLinkError5;
                    }
                }
                if (l2 != 0L) break block23;
                throw new UnsatisfiedLinkError("Unable to load library '" + string + "': " + unsatisfiedLinkError2.getMessage());
            }
        }
        return new aq(string, (String)object, l2, map);
    }

    private String h(String string) {
        String string2;
        int n2;
        String string3 = string;
        String string4 = "---";
        String string5 = aq.j("---");
        int n3 = string5.indexOf("---");
        if (n3 > 0 && string3.startsWith(string5.substring(0, n3))) {
            string3 = string3.substring(n3);
        }
        if ((n2 = string3.indexOf(string2 = string5.substring(n3 + "---".length()))) != -1) {
            string3 = string3.substring(0, n2);
        }
        return string3;
    }

    public static final aq a(String string) {
        return aq.a(string, Collections.EMPTY_MAP);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static final aq a(String string, Map hashMap) {
        if ((hashMap = new HashMap<String, Integer>(hashMap)).get("calling-convention") == null) {
            hashMap.put("calling-convention", new Integer(0));
        }
        if (ax.c() && "c".equals(string)) {
            string = null;
        }
        Map map = h;
        synchronized (map) {
            aq aq2;
            WeakReference<aq> weakReference = (WeakReference<aq>)h.get(string + hashMap);
            aq aq3 = aq2 = weakReference != null ? (aq)weakReference.get() : null;
            if (aq2 == null) {
                aq2 = string == null ? new aq("<process>", null, Native.open(null), hashMap) : aq.b(string, hashMap);
                weakReference = new WeakReference<aq>(aq2);
                h.put(aq2.c() + hashMap, weakReference);
                File file = aq2.d();
                if (file != null) {
                    h.put(file.getAbsolutePath() + hashMap, weakReference);
                    h.put(file.getName() + hashMap, weakReference);
                }
            }
            return aq2;
        }
    }

    public static final synchronized aq a() {
        return aq.a(null);
    }

    public static final synchronized aq a(Map map) {
        return aq.a(null, map);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static final void a(String string, String string2) {
        Map map = i;
        synchronized (map) {
            List<String> list = (List<String>)i.get(string);
            if (list == null) {
                list = Collections.synchronizedList(new LinkedList());
                i.put(string, list);
            }
            list.add(string2);
        }
    }

    public n b(String string) {
        return this.a(string, this.a);
    }

    n a(String string, Method method) {
        int n2 = this.a;
        Class<?>[] arrclass = method.getExceptionTypes();
        for (int i2 = 0; i2 < arrclass.length; ++i2) {
            if (!(c == null ? aq.f("com.sun.jna.w") : c).isAssignableFrom(arrclass[i2])) continue;
            n2 |= 4;
        }
        return this.a(string, n2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public n a(String string, int n2) {
        if (string == null) {
            throw new NullPointerException("Function name may not be null");
        }
        Map map = this.g;
        synchronized (map) {
            String string2 = aq.b(string, n2);
            n n3 = (n)this.g.get(string2);
            if (n3 == null) {
                n3 = new n(this, string, n2);
                this.g.put(string2, n3);
            }
            return n3;
        }
    }

    public Map b() {
        return this.b;
    }

    public ay c(String string) {
        try {
            return new ay(this.d(string));
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            throw new UnsatisfiedLinkError("Error looking up '" + string + "': " + unsatisfiedLinkError.getMessage());
        }
    }

    long d(String string) {
        if (this.d == 0L) {
            throw new UnsatisfiedLinkError("Library has been unloaded");
        }
        return Native.findSymbol(this.d, string);
    }

    public String toString() {
        return "Native Library <" + this.f + "@" + this.d + ">";
    }

    public String c() {
        return this.e;
    }

    public File d() {
        if (this.f == null) {
            return null;
        }
        return new File(this.f);
    }

    protected void finalize() {
        this.f();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static void e() {
        HashSet hashSet;
        Object object = h;
        synchronized (object) {
            hashSet = new HashSet(h.values());
        }
        object = hashSet.iterator();
        while (object.hasNext()) {
            WeakReference weakReference = (WeakReference)object.next();
            aq aq2 = (aq)weakReference.get();
            if (aq2 == null) continue;
            aq2.f();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void f() {
        Object object = h;
        synchronized (object) {
            Iterator iterator = h.values().iterator();
            while (iterator.hasNext()) {
                WeakReference weakReference = (WeakReference)iterator.next();
                if (weakReference.get() != this) continue;
                iterator.remove();
            }
        }
        object = this;
        synchronized (object) {
            if (this.d != 0L) {
                Native.close(this.d);
                this.d = 0L;
            }
        }
    }

    private static List i(String string) {
        String string2 = System.getProperty(string, "");
        if ("".equals(string2)) {
            return Collections.EMPTY_LIST;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(string2, File.pathSeparator);
        ArrayList<String> arrayList = new ArrayList<String>();
        while (stringTokenizer.hasMoreTokens()) {
            String string3 = stringTokenizer.nextToken();
            if ("".equals(string3)) continue;
            arrayList.add(string3);
        }
        return arrayList;
    }

    private static String b(String string, List list) {
        if (new File(string).isAbsolute()) {
            return string;
        }
        String string2 = aq.j(string);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            String string3 = (String)iterator.next();
            File file = new File(string3, string2);
            if (file.exists()) {
                return file.getAbsolutePath();
            }
            if (!ax.b() || !string2.endsWith(".dylib") || !(file = new File(string3, string2.substring(0, string2.lastIndexOf(".dylib")) + ".jnilib")).exists()) continue;
            return file.getAbsolutePath();
        }
        return string2;
    }

    private static String j(String string) {
        if (ax.b()) {
            if (string.startsWith("lib") && (string.endsWith(".dylib") || string.endsWith(".jnilib"))) {
                return string;
            }
            String string2 = System.mapLibraryName(string);
            if (string2.endsWith(".jnilib")) {
                return string2.substring(0, string2.lastIndexOf(".jnilib")) + ".dylib";
            }
            return string2;
        }
        if (ax.c() ? aq.k(string) || string.endsWith(".so") : ax.e() && (string.endsWith(".drv") || string.endsWith(".dll"))) {
            return string;
        }
        return System.mapLibraryName(string);
    }

    private static boolean k(String string) {
        int n2;
        if (string.startsWith("lib") && (n2 = string.lastIndexOf(".so.")) != -1 && n2 + 4 < string.length()) {
            for (int i2 = n2 + 4; i2 < string.length(); ++i2) {
                char c2 = string.charAt(i2);
                if (Character.isDigit(c2) || c2 == '.') continue;
                return false;
            }
            return true;
        }
        return false;
    }

    static String a(String string, List list) {
        File file = new File(string);
        if (file.isAbsolute()) {
            list = Arrays.asList(file.getParent());
        }
        as as2 = new as(string);
        LinkedList<File> linkedList = new LinkedList<File>();
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            File[] arrfile = new File(iterator.next()).listFiles(as2);
            if (arrfile == null || arrfile.length <= 0) continue;
            linkedList.addAll(Arrays.asList(arrfile));
        }
        double d2 = -1.0;
        String string2 = null;
        Iterator iterator2 = linkedList.iterator();
        while (iterator2.hasNext()) {
            String string3 = ((File)iterator2.next()).getAbsolutePath();
            String string4 = string3.substring(string3.lastIndexOf(".so.") + 4);
            double d3 = aq.e(string4);
            if (!(d3 > d2)) continue;
            d2 = d3;
            string2 = string3;
        }
        return string2;
    }

    static double e(String string) {
        double d2 = 0.0;
        double d3 = 1.0;
        int n2 = string.indexOf(".");
        while (string != null) {
            String string2;
            if (n2 != -1) {
                string2 = string.substring(0, n2);
                string = string.substring(n2 + 1);
                n2 = string.indexOf(".");
            } else {
                string2 = string;
                string = null;
            }
            try {
                d2 += (double)Integer.parseInt(string2) / d3;
            }
            catch (NumberFormatException numberFormatException) {
                return 0.0;
            }
            d3 *= 100.0;
        }
        return d2;
    }

    static Class f(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError().initCause(classNotFoundException);
        }
    }

    static boolean g(String string) {
        return aq.k(string);
    }

    static {
        if (Native.a == 0) {
            throw new Error("Native library not initialized");
        }
        String string = Native.d("jnidispatch");
        if (string != null) {
            j.add(string);
        }
        if (System.getProperty("jna.platform.library.path") == null && !ax.e()) {
            Object object;
            String string2 = "";
            String string3 = "";
            String string4 = "";
            if (ax.c() || ax.f() || ax.g()) {
                string4 = (ax.f() ? "/" : "") + ay.H * 8;
            }
            String[] arrstring = new String[]{"/usr/lib" + string4, "/lib" + string4, "/usr/lib", "/lib"};
            if (ax.c()) {
                String string5 = "";
                object = "linux";
                String string6 = "gnu";
                if (ax.l()) {
                    string5 = ax.k() ? "x86_64" : "i386";
                } else if (ax.m()) {
                    string5 = ax.k() ? "powerpc64" : "powerpc";
                } else if (ax.n()) {
                    string5 = "arm";
                    string6 = "gnueabi";
                }
                String string7 = string5 + "-" + (String)object + "-" + string6;
                arrstring = new String[]{"/usr/lib/" + string7, "/lib/" + string7, "/usr/lib" + string4, "/lib" + string4, "/usr/lib", "/lib"};
            }
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                object = new File(arrstring[i2]);
                if (!((File)object).exists() || !((File)object).isDirectory()) continue;
                string2 = string2 + string3 + arrstring[i2];
                string3 = File.pathSeparator;
            }
            if (!"".equals(string2)) {
                System.setProperty("jna.platform.library.path", string2);
            }
        }
        j.addAll(aq.i("jna.platform.library.path"));
    }
}

