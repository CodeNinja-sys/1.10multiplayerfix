/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.Callback;
import com.sun.jna.FromNativeConverter;
import com.sun.jna.Native$ffi_callback;
import com.sun.jna.ToNativeConverter;
import com.sun.jna.ag;
import com.sun.jna.ah;
import com.sun.jna.ai;
import com.sun.jna.aj;
import com.sun.jna.ak;
import com.sun.jna.al;
import com.sun.jna.am;
import com.sun.jna.an;
import com.sun.jna.ao;
import com.sun.jna.ap;
import com.sun.jna.aq;
import com.sun.jna.au;
import com.sun.jna.av;
import com.sun.jna.ax;
import com.sun.jna.ay;
import com.sun.jna.b;
import com.sun.jna.bd;
import com.sun.jna.bk;
import com.sun.jna.bs;
import com.sun.jna.bu;
import com.sun.jna.e;
import com.sun.jna.j;
import com.sun.jna.m;
import com.sun.jna.n;
import com.sun.jna.r;
import com.sun.jna.x;
import com.sun.jna.z;
import java.awt.Component;
import java.awt.Window;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.WeakHashMap;

public final class Native {
    private static final String E = "3.4.0";
    private static final String F = "3.4.0";
    private static String G;
    private static Map H;
    private static Map I;
    private static Map J;
    private static Map K;
    private static final b L;
    private static b M;
    public static final int a;
    public static final int b;
    public static final int c;
    public static final int d;
    private static final int N = 0;
    private static final int O = 1;
    private static final int P = 2;
    private static final int Q = 3;
    private static final int R = 0;
    private static final int S = -1;
    private static final int T = -2;
    private static final Object U;
    private static final ThreadLocal V;
    private static Map W;
    private static Map X;
    private static Object Y;
    static final int e = 1;
    private static final int Z = -1;
    private static final int aa = 0;
    private static final int ab = 1;
    private static final int ac = 2;
    private static final int ad = 3;
    private static final int ae = 4;
    private static final int af = 5;
    private static final int ag = 6;
    private static final int ah = 7;
    private static final int ai = 8;
    private static final int aj = 9;
    private static final int ak = 10;
    private static final int al = 11;
    private static final int am = 12;
    private static final int an = 13;
    private static final int ao = 14;
    private static final int ap = 15;
    private static final int aq = 16;
    private static final int ar = 17;
    private static final int as = 18;
    private static final int at = 19;
    private static final int au = 20;
    private static final int av = 21;
    static Class f;
    static Class g;
    static Class h;
    static Class i;
    static Class j;
    static Class k;
    static Class l;
    static Class m;
    static Class n;
    static Class o;
    static Class p;
    static Class q;
    static Class r;
    static Class s;
    static Class t;
    static Class u;
    static Class v;
    static Class w;
    static Class x;
    static Class y;
    static Class z;
    static Class A;
    static Class B;
    static Class C;
    static Class D;

    private static void i() {
        com.sun.jna.aq.e();
        G = null;
    }

    private static boolean g(String string) {
        File file = new File(string);
        if (file.delete()) {
            return true;
        }
        Native.a(file);
        return false;
    }

    private Native() {
    }

    private static native void initIDs();

    public static synchronized native void setProtected(boolean var0);

    public static synchronized native boolean isProtected();

    public static synchronized native void setPreserveLastError(boolean var0);

    public static synchronized native boolean getPreserveLastError();

    public static long a(Window window) {
        return com.sun.jna.ao.a(window);
    }

    public static long a(Component component) {
        return com.sun.jna.ao.a(component);
    }

    public static ay b(Window window) {
        return new ay(com.sun.jna.ao.a(window));
    }

    public static ay b(Component component) {
        return new ay(com.sun.jna.ao.a(component));
    }

    static native long getWindowHandle0(Component var0);

    public static ay a(Buffer buffer) {
        long l2 = Native._getDirectBufferPointer(buffer);
        return l2 == 0L ? null : new ay(l2);
    }

    private static native long _getDirectBufferPointer(Buffer var0);

    public static String a(byte[] arrby) {
        return Native.a(arrby, System.getProperty("jna.encoding"));
    }

    public static String a(byte[] arrby, String string) {
        int n2;
        String string2 = null;
        if (string != null) {
            try {
                string2 = new String(arrby, string);
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                // empty catch block
            }
        }
        if (string2 == null) {
            string2 = new String(arrby);
        }
        if ((n2 = string2.indexOf(0)) != -1) {
            string2 = string2.substring(0, n2);
        }
        return string2;
    }

    public static String a(char[] arrc) {
        String string = new String(arrc);
        int n2 = string.indexOf(0);
        if (n2 != -1) {
            string = string.substring(0, n2);
        }
        return string;
    }

    public static Object a(Class class_) {
        return Native.a(null, class_);
    }

    public static Object a(Class class_, Map map) {
        return Native.a(null, class_, map);
    }

    public static Object a(String string, Class class_) {
        return Native.a(string, class_, Collections.EMPTY_MAP);
    }

    public static Object a(String string, Class class_, Map map) {
        z z2 = new z(string, class_, map);
        ClassLoader classLoader = class_.getClassLoader();
        x x2 = (x)Proxy.newProxyInstance(classLoader, new Class[]{class_}, (InvocationHandler)z2);
        Native.a(class_, map, x2);
        return x2;
    }

    private static void j(Class class_) {
        if (class_ != null && !K.containsKey(class_)) {
            try {
                Field[] arrfield = class_.getFields();
                for (int i2 = 0; i2 < arrfield.length; ++i2) {
                    Field field = arrfield[i2];
                    if (field.getType() != class_ || !Modifier.isStatic(field.getModifiers())) continue;
                    K.put(class_, new WeakReference<Object>(field.get(null)));
                    break;
                }
            }
            catch (Exception exception) {
                throw new IllegalArgumentException("Could not access instance of " + class_ + " (" + exception + ")");
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static Class b(Class class_) {
        Class class_2;
        if (class_ == null) {
            return null;
        }
        Object object = K;
        synchronized (object) {
            if (J.containsKey(class_)) {
                return class_;
            }
        }
        if ((f == null ? (f = Native.f("com.sun.jna.x")) : f).isAssignableFrom(class_)) {
            return class_;
        }
        if ((g == null ? (g = Native.f("com.sun.jna.Callback")) : g).isAssignableFrom(class_)) {
            class_ = com.sun.jna.e.a(class_);
        }
        if ((class_2 = Native.b((Class)(object = class_.getDeclaringClass()))) != null) {
            return class_2;
        }
        return Native.b(class_.getSuperclass());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static Map c(Class class_) {
        Map map = K;
        synchronized (map) {
            Class class_2 = Native.b(class_);
            if (class_2 != null) {
                Native.j(class_2);
            } else {
                class_2 = class_;
            }
            if (!J.containsKey(class_2)) {
                try {
                    Field field = class_2.getField("OPTIONS");
                    field.setAccessible(true);
                    J.put(class_2, field.get(null));
                }
                catch (NoSuchFieldException noSuchFieldException) {
                }
                catch (Exception exception) {
                    throw new IllegalArgumentException("OPTIONS must be a public field of type java.util.Map (" + exception + "): " + class_2);
                }
            }
            return (Map)J.get(class_2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static bu d(Class class_) {
        Map map = K;
        synchronized (map) {
            Class class_2 = Native.b(class_);
            if (class_2 != null) {
                Native.j(class_2);
            } else {
                class_2 = class_;
            }
            if (!H.containsKey(class_2)) {
                try {
                    Field field = class_2.getField("TYPE_MAPPER");
                    field.setAccessible(true);
                    H.put(class_2, field.get(null));
                }
                catch (NoSuchFieldException noSuchFieldException) {
                    Map map2 = Native.c(class_);
                    if (map2 != null && map2.containsKey("type-mapper")) {
                        H.put(class_2, map2.get("type-mapper"));
                    }
                }
                catch (Exception exception) {
                    throw new IllegalArgumentException("TYPE_MAPPER must be a public field of type " + (h == null ? (h = Native.f("com.sun.jna.bu")) : h).getName() + " (" + exception + "): " + class_2);
                }
            }
            return (bu)H.get(class_2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int e(Class class_) {
        Map map = K;
        synchronized (map) {
            Object object;
            Class class_2 = Native.b(class_);
            if (class_2 != null) {
                Native.j(class_2);
            } else {
                class_2 = class_;
            }
            if (!I.containsKey(class_2)) {
                try {
                    object = class_2.getField("STRUCTURE_ALIGNMENT");
                    ((Field)object).setAccessible(true);
                    I.put(class_2, ((Field)object).get(null));
                }
                catch (NoSuchFieldException noSuchFieldException) {
                    Map map2 = Native.c(class_2);
                    if (map2 != null && map2.containsKey("structure-alignment")) {
                        I.put(class_2, map2.get("structure-alignment"));
                    }
                }
                catch (Exception exception) {
                    throw new IllegalArgumentException("STRUCTURE_ALIGNMENT must be a public field of type int (" + exception + "): " + class_2);
                }
            }
            int n2 = (object = (Integer)I.get(class_2)) != null ? (Integer)object : 0;
            return n2;
        }
    }

    static byte[] a(String string) {
        try {
            return Native.a(string, System.getProperty("jna.encoding"));
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return string.getBytes();
        }
    }

    static byte[] a(String string, String string2) {
        if (string2 != null) {
            return string.getBytes(string2);
        }
        return string.getBytes();
    }

    public static byte[] b(String string) {
        byte[] arrby = Native.a(string);
        byte[] arrby2 = new byte[arrby.length + 1];
        System.arraycopy(arrby, 0, arrby2, 0, arrby.length);
        return arrby2;
    }

    public static byte[] b(String string, String string2) {
        byte[] arrby = Native.a(string, string2);
        byte[] arrby2 = new byte[arrby.length + 1];
        System.arraycopy(arrby, 0, arrby2, 0, arrby.length);
        return arrby2;
    }

    public static char[] c(String string) {
        char[] arrc = string.toCharArray();
        char[] arrc2 = new char[arrc.length + 1];
        System.arraycopy(arrc, 0, arrc2, 0, arrc.length);
        return arrc2;
    }

    static String a(int n2, String string, String string2) {
        String string3;
        if ("powerpc".equals(string = string.toLowerCase())) {
            string = "ppc";
        } else if ("powerpc64".equals(string)) {
            string = "ppc64";
        }
        switch (n2) {
            case 2: {
                if ("i386".equals(string)) {
                    string = "x86";
                }
                string3 = "win32-" + string;
                break;
            }
            case 6: {
                string3 = "w32ce-" + string;
                break;
            }
            case 0: {
                string3 = "darwin";
                break;
            }
            case 1: {
                if ("x86".equals(string)) {
                    string = "i386";
                } else if ("x86_64".equals(string)) {
                    string = "amd64";
                }
                string3 = "linux-" + string;
                break;
            }
            case 3: {
                string3 = "sunos-" + string;
                break;
            }
            default: {
                int n3;
                string3 = string2.toLowerCase();
                if ("x86".equals(string)) {
                    string = "i386";
                }
                if ("x86_64".equals(string)) {
                    string = "amd64";
                }
                if ((n3 = string3.indexOf(" ")) != -1) {
                    string3 = string3.substring(0, n3);
                }
                string3 = string3 + "-" + string;
            }
        }
        return "/com/sun/jna/" + string3;
    }

    private static void j() {
        block13: {
            Native.c();
            String string = System.getProperty("jna.boot.library.name", "jnidispatch");
            String string2 = System.getProperty("jna.boot.library.path");
            if (string2 != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(string2, File.pathSeparator);
                while (stringTokenizer.hasMoreTokens()) {
                    String string3;
                    String string4;
                    String string5 = stringTokenizer.nextToken();
                    File file = new File(new File(string5), System.mapLibraryName(string));
                    String string6 = file.getAbsolutePath();
                    if (file.exists()) {
                        try {
                            System.load(string6);
                            G = string6;
                            return;
                        }
                        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
                            // empty catch block
                        }
                    }
                    if (!ax.b()) continue;
                    if (string6.endsWith("dylib")) {
                        string4 = "dylib";
                        string3 = "jnilib";
                    } else {
                        string4 = "jnilib";
                        string3 = "dylib";
                    }
                    if (!new File(string6 = string6.substring(0, string6.lastIndexOf(string4)) + string3).exists()) continue;
                    try {
                        System.load(string6);
                        G = string6;
                        return;
                    }
                    catch (UnsatisfiedLinkError unsatisfiedLinkError) {
                        System.err.println("File found at " + string6 + " but not loadable: " + unsatisfiedLinkError.getMessage());
                    }
                }
            }
            try {
                if (!Boolean.getBoolean("jna.nosys")) {
                    System.loadLibrary(string);
                    return;
                }
            }
            catch (UnsatisfiedLinkError unsatisfiedLinkError) {
                if (!Boolean.getBoolean("jna.nounpack")) break block13;
                throw unsatisfiedLinkError;
            }
        }
        if (!Boolean.getBoolean("jna.nounpack")) {
            Native.k();
            return;
        }
        throw new UnsatisfiedLinkError("Native jnidispatch library not found");
    }

    private static void k() {
        String string = System.mapLibraryName("jnidispatch");
        String string2 = System.getProperty("os.arch");
        String string3 = System.getProperty("os.name");
        String string4 = Native.a(ax.a(), string2, string3) + "/" + string;
        URL uRL = (i == null ? (i = Native.f("com.sun.jna.Native")) : i).getResource(string4);
        boolean bl2 = false;
        if (uRL == null && ax.b() && string4.endsWith(".dylib")) {
            string4 = string4.substring(0, string4.lastIndexOf(".dylib")) + ".jnilib";
            uRL = (i == null ? (i = Native.f("com.sun.jna.Native")) : i).getResource(string4);
        }
        if (uRL == null) {
            throw new UnsatisfiedLinkError("jnidispatch (" + string4 + ") not found in resource path");
        }
        File file = null;
        if (uRL.getProtocol().toLowerCase().equals("file")) {
            try {
                file = new File(new URI(uRL.toString()));
            }
            catch (URISyntaxException uRISyntaxException) {
                file = new File(uRL.getPath());
            }
            if (!file.exists()) {
                throw new Error("File URL " + uRL + " could not be properly decoded");
            }
        } else {
            InputStream inputStream = (i == null ? (i = Native.f("com.sun.jna.Native")) : i).getResourceAsStream(string4);
            if (inputStream == null) {
                throw new Error("Can't obtain jnidispatch InputStream");
            }
            FileOutputStream fileOutputStream = null;
            try {
                int n2;
                File file2 = Native.b();
                file = File.createTempFile("jna", ax.e() ? ".dll" : null, file2);
                file.deleteOnExit();
                fileOutputStream = new FileOutputStream(file);
                byte[] arrby = new byte[1024];
                while ((n2 = inputStream.read(arrby, 0, arrby.length)) > 0) {
                    fileOutputStream.write(arrby, 0, n2);
                }
                bl2 = true;
            }
            catch (IOException iOException) {
                throw new Error("Failed to create temporary file for jnidispatch library: " + iOException);
            }
            finally {
                try {
                    inputStream.close();
                }
                catch (IOException iOException) {}
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    }
                    catch (IOException iOException) {}
                }
            }
        }
        System.load(file.getAbsolutePath());
        G = file.getAbsolutePath();
        if (bl2) {
            Native.g(file.getAbsolutePath());
        }
    }

    private static native int sizeof(int var0);

    private static native String getNativeVersion();

    private static native String getAPIChecksum();

    public static int a() {
        return (Integer)V.get();
    }

    public static native void setLastError(int var0);

    static void a(int n2) {
        V.set(new Integer(n2));
    }

    public static x a(x x2) {
        Class<?> class_ = x2.getClass();
        if (!Proxy.isProxyClass(class_)) {
            throw new IllegalArgumentException("Library must be a proxy class");
        }
        InvocationHandler invocationHandler = Proxy.getInvocationHandler(x2);
        if (!(invocationHandler instanceof z)) {
            throw new IllegalArgumentException("Unrecognized proxy handler: " + invocationHandler);
        }
        z z2 = (z)invocationHandler;
        aj aj2 = new aj(z2, x2);
        return (x)Proxy.newProxyInstance(class_.getClassLoader(), class_.getInterfaces(), (InvocationHandler)aj2);
    }

    public static String d(String string) {
        if (System.getProperty("javawebstart.version") == null) {
            return null;
        }
        try {
            ClassLoader classLoader = (i == null ? (i = Native.f("com.sun.jna.Native")) : i).getClassLoader();
            Method method = (Method)AccessController.doPrivileged(new ak());
            String string2 = (String)method.invoke(classLoader, string);
            if (string2 != null) {
                return new File(string2).getParent();
            }
            return null;
        }
        catch (Exception exception) {
            return null;
        }
    }

    static void a(File file) {
        try {
            File file2 = new File(file.getParentFile(), file.getName() + ".x");
            file2.createNewFile();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    static File b() {
        File file = new File(System.getProperty("java.io.tmpdir"));
        File file2 = new File(file, "jna");
        file2.mkdirs();
        return file2.exists() ? file2 : file;
    }

    static void c() {
        File file = Native.b();
        al al2 = new al();
        File[] arrfile = file.listFiles(al2);
        for (int i2 = 0; arrfile != null && i2 < arrfile.length; ++i2) {
            File file2 = arrfile[i2];
            String string = file2.getName();
            string = string.substring(0, string.length() - 2);
            File file3 = new File(file2.getParentFile(), string);
            if (file3.exists() && !file3.delete()) continue;
            file2.delete();
        }
    }

    public static int a(Class class_, Object object) {
        if (class_.isArray()) {
            int n2 = Array.getLength(object);
            if (n2 > 0) {
                Object object2 = Array.get(object, 0);
                return n2 * Native.a(class_.getComponentType(), object2);
            }
            throw new IllegalArgumentException("Arrays of length zero not allowed: " + class_);
        }
        if ((l == null ? (l = Native.f("com.sun.jna.bd")) : l).isAssignableFrom(class_) && !(m == null ? (m = Native.f("com.sun.jna.bi")) : m).isAssignableFrom(class_)) {
            if (object == null) {
                object = bd.a(class_);
            }
            return ((bd)object).e();
        }
        try {
            return Native.f(class_);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new IllegalArgumentException("The type \"" + class_.getName() + "\" is not supported: " + illegalArgumentException.getMessage());
        }
    }

    public static int f(Class class_) {
        if ((n == null ? (n = Native.f("com.sun.jna.au")) : n).isAssignableFrom(class_)) {
            class_ = com.sun.jna.av.a(class_).a();
        }
        if (class_ == Boolean.TYPE || class_ == (o == null ? (o = Native.f("java.lang.Boolean")) : o)) {
            return 4;
        }
        if (class_ == Byte.TYPE || class_ == (p == null ? (p = Native.f("java.lang.Byte")) : p)) {
            return 1;
        }
        if (class_ == Short.TYPE || class_ == (q == null ? (q = Native.f("java.lang.Short")) : q)) {
            return 2;
        }
        if (class_ == Character.TYPE || class_ == (r == null ? (r = Native.f("java.lang.Character")) : r)) {
            return c;
        }
        if (class_ == Integer.TYPE || class_ == (s == null ? (s = Native.f("java.lang.Integer")) : s)) {
            return 4;
        }
        if (class_ == Long.TYPE || class_ == (t == null ? (t = Native.f("java.lang.Long")) : t)) {
            return 8;
        }
        if (class_ == Float.TYPE || class_ == (u == null ? (u = Native.f("java.lang.Float")) : u)) {
            return 4;
        }
        if (class_ == Double.TYPE || class_ == (v == null ? (v = Native.f("java.lang.Double")) : v)) {
            return 8;
        }
        if ((l == null ? (l = Native.f("com.sun.jna.bd")) : l).isAssignableFrom(class_)) {
            if ((w == null ? (w = Native.f("com.sun.jna.bj")) : w).isAssignableFrom(class_)) {
                return bd.a(class_).e();
            }
            return a;
        }
        if ((x == null ? (x = Native.f("com.sun.jna.ay")) : x).isAssignableFrom(class_) || ax.j && com.sun.jna.ap.a(class_) || (g == null ? (g = Native.f("com.sun.jna.Callback")) : g).isAssignableFrom(class_) || (j == null ? (j = Native.f("java.lang.String")) : j) == class_ || (y == null ? (y = Native.f("com.sun.jna.bw")) : y) == class_) {
            return a;
        }
        throw new IllegalArgumentException("Native size for type \"" + class_.getName() + "\" is unknown");
    }

    public static boolean g(Class class_) {
        if ((l == null ? (l = Native.f("com.sun.jna.bd")) : l).isAssignableFrom(class_)) {
            return true;
        }
        try {
            return Native.f(class_) != 0;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return false;
        }
    }

    public static void a(b b2) {
        M = b2 == null ? L : b2;
    }

    public static b d() {
        return M;
    }

    public static void e(String string) {
        Native.a(Native.h(Native.e()), com.sun.jna.aq.a(string));
    }

    public static void a(aq aq2) {
        Native.a(Native.h(Native.e()), aq2);
    }

    static Class h(Class class_) {
        int n2;
        Method[] arrmethod = class_.getDeclaredMethods();
        for (n2 = 0; n2 < arrmethod.length; ++n2) {
            if ((arrmethod[n2].getModifiers() & 0x100) == 0) continue;
            return class_;
        }
        n2 = class_.getName().lastIndexOf("$");
        if (n2 != -1) {
            String string = class_.getName().substring(0, n2);
            try {
                return Native.h(Class.forName(string, true, class_.getClassLoader()));
            }
            catch (ClassNotFoundException classNotFoundException) {
                // empty catch block
            }
        }
        throw new IllegalArgumentException("Can't determine class with native methods from the current context (" + class_ + ")");
    }

    static Class e() {
        Class[] arrclass = new am().getClassContext();
        if (arrclass.length < 4) {
            throw new IllegalStateException("This method must be called from the static initializer of a class");
        }
        return arrclass[3];
    }

    public static void a(Callback callback, j j2) {
        com.sun.jna.e.a(callback, j2);
    }

    public static void f() {
        Native.i(Native.h(Native.e()));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void i(Class class_) {
        Map map = W;
        synchronized (map) {
            if (W.containsKey(class_)) {
                Native.unregister(class_, (long[])W.get(class_));
                W.remove(class_);
                X.remove(class_);
            }
        }
    }

    private static native void unregister(Class var0, long[] var1);

    private static String k(Class class_) {
        if (class_.isArray()) {
            return "[" + Native.k(class_.getComponentType());
        }
        if (class_.isPrimitive()) {
            if (class_ == Void.TYPE) {
                return "V";
            }
            if (class_ == Boolean.TYPE) {
                return "Z";
            }
            if (class_ == Byte.TYPE) {
                return "B";
            }
            if (class_ == Short.TYPE) {
                return "S";
            }
            if (class_ == Character.TYPE) {
                return "C";
            }
            if (class_ == Integer.TYPE) {
                return "I";
            }
            if (class_ == Long.TYPE) {
                return "J";
            }
            if (class_ == Float.TYPE) {
                return "F";
            }
            if (class_ == Double.TYPE) {
                return "D";
            }
        }
        return "L" + Native.a(".", "/", class_.getName()) + ";";
    }

    static String a(String string, String string2, String string3) {
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            int n2;
            if ((n2 = string3.indexOf(string)) == -1) break;
            stringBuffer.append(string3.substring(0, n2));
            stringBuffer.append(string2);
            string3 = string3.substring(n2 + string.length());
        }
        stringBuffer.append(string3);
        return stringBuffer.toString();
    }

    private static int a(Class class_, bu bu2) {
        if (class_ == (o == null ? (o = Native.f("java.lang.Boolean")) : o)) {
            class_ = Boolean.TYPE;
        } else if (class_ == (p == null ? (p = Native.f("java.lang.Byte")) : p)) {
            class_ = Byte.TYPE;
        } else if (class_ == (q == null ? (q = Native.f("java.lang.Short")) : q)) {
            class_ = Short.TYPE;
        } else if (class_ == (r == null ? (r = Native.f("java.lang.Character")) : r)) {
            class_ = Character.TYPE;
        } else if (class_ == (s == null ? (s = Native.f("java.lang.Integer")) : s)) {
            class_ = Integer.TYPE;
        } else if (class_ == (t == null ? (t = Native.f("java.lang.Long")) : t)) {
            class_ = Long.TYPE;
        } else if (class_ == (u == null ? (u = Native.f("java.lang.Float")) : u)) {
            class_ = Float.TYPE;
        } else if (class_ == (v == null ? (v = Native.f("java.lang.Double")) : v)) {
            class_ = Double.TYPE;
        } else if (class_ == (z == null ? (z = Native.f("java.lang.Void")) : z)) {
            class_ = Void.TYPE;
        }
        if (bu2 != null && (bu2.a(class_) != null || bu2.b(class_) != null)) {
            return 21;
        }
        if ((x == null ? (x = Native.f("com.sun.jna.ay")) : x).isAssignableFrom(class_)) {
            return 1;
        }
        if ((j == null ? (j = Native.f("java.lang.String")) : j) == class_) {
            return 2;
        }
        if ((y == null ? (y = Native.f("com.sun.jna.bw")) : y).isAssignableFrom(class_)) {
            return 18;
        }
        if (ax.j && com.sun.jna.ap.a(class_)) {
            return 5;
        }
        if ((l == null ? (l = Native.f("com.sun.jna.bd")) : l).isAssignableFrom(class_)) {
            if ((w == null ? (w = Native.f("com.sun.jna.bj")) : w).isAssignableFrom(class_)) {
                return 4;
            }
            return 3;
        }
        if (class_.isArray()) {
            switch (class_.getName().charAt(1)) {
                case 'Z': {
                    return 13;
                }
                case 'B': {
                    return 6;
                }
                case 'S': {
                    return 7;
                }
                case 'C': {
                    return 8;
                }
                case 'I': {
                    return 9;
                }
                case 'J': {
                    return 10;
                }
                case 'F': {
                    return 11;
                }
                case 'D': {
                    return 12;
                }
            }
        }
        if (class_.isPrimitive()) {
            return class_ == Boolean.TYPE ? 14 : 0;
        }
        if ((g == null ? (g = Native.f("com.sun.jna.Callback")) : g).isAssignableFrom(class_)) {
            return 15;
        }
        if ((A == null ? (A = Native.f("com.sun.jna.u")) : A).isAssignableFrom(class_)) {
            return 19;
        }
        if ((B == null ? (B = Native.f("com.sun.jna.bb")) : B).isAssignableFrom(class_)) {
            return 20;
        }
        if ((n == null ? (n = Native.f("com.sun.jna.au")) : n).isAssignableFrom(class_)) {
            return 17;
        }
        return -1;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(Class class_, aq aq2) {
        Method[] arrmethod = class_.getDeclaredMethods();
        ArrayList<Method> arrayList = new ArrayList<Method>();
        bu bu2 = (bu)aq2.b().get("type-mapper");
        for (int i2 = 0; i2 < arrmethod.length; ++i2) {
            if ((arrmethod[i2].getModifiers() & 0x100) == 0) continue;
            arrayList.add(arrmethod[i2]);
        }
        long[] arrl = new long[arrayList.size()];
        for (int i3 = 0; i3 < arrl.length; ++i3) {
            Object object;
            long l2;
            long l3;
            Method method = (Method)arrayList.get(i3);
            String string = "(";
            Class<?> class_2 = method.getReturnType();
            Class<?>[] arrclass = method.getParameterTypes();
            long[] arrl2 = new long[arrclass.length];
            long[] arrl3 = new long[arrclass.length];
            int[] arrn = new int[arrclass.length];
            ToNativeConverter[] arrtoNativeConverter = new ToNativeConverter[arrclass.length];
            FromNativeConverter fromNativeConverter = null;
            int n2 = Native.a(class_2, bu2);
            boolean bl2 = false;
            switch (n2) {
                case -1: {
                    throw new IllegalArgumentException(class_2 + " is not a supported return type (in method " + method.getName() + " in " + class_ + ")");
                }
                case 21: {
                    fromNativeConverter = bu2.a(class_2);
                    l3 = bk.b(class_2).J;
                    l2 = bk.b((Object)fromNativeConverter.a()).J;
                    break;
                }
                case 17: 
                case 19: 
                case 20: {
                    l3 = bk.b((Object)(Native.x == null ? Native.f((String)"com.sun.jna.ay") : Native.x)).J;
                    l2 = bk.b((Object)com.sun.jna.av.a(class_2).a()).J;
                    break;
                }
                case 3: {
                    l3 = l2 = bk.b((Object)(Native.x == null ? Native.f((String)"com.sun.jna.ay") : Native.x)).J;
                    break;
                }
                case 4: {
                    l3 = bk.b((Object)(Native.x == null ? Native.f((String)"com.sun.jna.ay") : Native.x)).J;
                    l2 = bk.b(class_2).J;
                    break;
                }
                default: {
                    l3 = l2 = bk.b(class_2).J;
                }
            }
            block19: for (int i4 = 0; i4 < arrclass.length; ++i4) {
                object = arrclass[i4];
                string = string + Native.k(object);
                arrn[i4] = Native.a(object, bu2);
                if (arrn[i4] == -1) {
                    throw new IllegalArgumentException(object + " is not a supported argument type (in method " + method.getName() + " in " + class_ + ")");
                }
                if (arrn[i4] == 17 || arrn[i4] == 19) {
                    object = com.sun.jna.av.a(object).a();
                } else if (arrn[i4] == 21) {
                    arrtoNativeConverter[i4] = bu2.b((Class)object);
                }
                switch (arrn[i4]) {
                    case 4: 
                    case 17: 
                    case 19: 
                    case 20: {
                        arrl2[i4] = bk.b((Object)object).J;
                        arrl3[i4] = bk.b((Object)(Native.x == null ? Native.f((String)"com.sun.jna.ay") : Native.x)).J;
                        continue block19;
                    }
                    case 21: {
                        arrl3[i4] = ((Class)object).isPrimitive() ? bk.b((Object)object).J : bk.b((Object)(Native.x == null ? Native.f((String)"com.sun.jna.ay") : Native.x)).J;
                        arrl2[i4] = bk.b((Object)arrtoNativeConverter[i4].a()).J;
                        continue block19;
                    }
                    case 0: {
                        arrl3[i4] = arrl2[i4] = bk.b((Object)object).J;
                        continue block19;
                    }
                    default: {
                        arrl3[i4] = arrl2[i4] = bk.b((Object)(Native.x == null ? Native.f((String)"com.sun.jna.ay") : Native.x)).J;
                    }
                }
            }
            string = string + ")";
            string = string + Native.k(class_2);
            Class<?>[] arrclass2 = method.getExceptionTypes();
            for (int i5 = 0; i5 < arrclass2.length; ++i5) {
                if (!(C == null ? Native.f("com.sun.jna.w") : C).isAssignableFrom(arrclass2[i5])) continue;
                bl2 = true;
                break;
            }
            object = method.getName();
            r r2 = (r)aq2.b().get("function-mapper");
            if (r2 != null) {
                object = r2.a(aq2, method);
            }
            n n3 = aq2.a((String)object, method);
            try {
                arrl[i3] = Native.registerMethod(class_, method.getName(), string, arrn, arrl3, arrl2, n2, l3, l2, class_2, n3.J, n3.b(), bl2, arrtoNativeConverter, fromNativeConverter);
                continue;
            }
            catch (NoSuchMethodError noSuchMethodError) {
                throw new UnsatisfiedLinkError("No method " + method.getName() + " with signature " + string + " in " + class_);
            }
        }
        Map map = W;
        synchronized (map) {
            W.put(class_, arrl);
            X.put(class_, aq2);
        }
        Native.a(class_, aq2.b(), null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void a(Class class_, Map map, Object object) {
        Map map2 = K;
        synchronized (map2) {
            if (!map.isEmpty()) {
                J.put(class_, map);
            }
            if (map.containsKey("type-mapper")) {
                H.put(class_, map.get("type-mapper"));
            }
            if (map.containsKey("structure-alignment")) {
                I.put(class_, map.get("structure-alignment"));
            }
            if (object != null) {
                K.put(class_, new WeakReference<Object>(object));
            }
            if (!class_.isInterface() && (f == null ? (f = Native.f("com.sun.jna.x")) : f).isAssignableFrom(class_)) {
                Class<?>[] arrclass = class_.getInterfaces();
                for (int i2 = 0; i2 < arrclass.length; ++i2) {
                    if (!(f == null ? Native.f("com.sun.jna.x") : f).isAssignableFrom(arrclass[i2])) continue;
                    Native.a(arrclass[i2], map, object);
                    break;
                }
            }
        }
    }

    private static native long registerMethod(Class var0, String var1, String var2, int[] var3, long[] var4, long[] var5, int var6, long var7, long var9, Class var11, long var12, int var14, boolean var15, ToNativeConverter[] var16, FromNativeConverter var17);

    private static au b(Class class_, Object object) {
        return (au)com.sun.jna.av.a(class_).a(object, new m(class_));
    }

    private static Class l(Class class_) {
        return com.sun.jna.av.a(class_).a();
    }

    private static Object a(ToNativeConverter toNativeConverter, Object object) {
        return toNativeConverter.a(object, new bs());
    }

    private static Object a(FromNativeConverter fromNativeConverter, Object object, Class class_) {
        return fromNativeConverter.a(object, new m(class_));
    }

    public static native long ffi_prep_cif(int var0, int var1, long var2, long var4);

    public static native void ffi_call(long var0, long var2, long var4, long var6);

    public static native long ffi_prep_closure(long var0, Native$ffi_callback var2);

    public static native void ffi_free_closure(long var0);

    static native int initialize_ffi_type(long var0);

    public static void main(String[] arrstring) {
        String string;
        String string2;
        String string3 = "Java Native Access (JNA)";
        String string4 = "3.4.0";
        String string5 = "3.4.0 (package information missing)";
        Package package_ = (i == null ? (i = Native.f("com.sun.jna.Native")) : i).getPackage();
        String string6 = string2 = package_ != null ? package_.getSpecificationTitle() : "Java Native Access (JNA)";
        if (string2 == null) {
            string2 = "Java Native Access (JNA)";
        }
        String string7 = string = package_ != null ? package_.getSpecificationVersion() : "3.4.0";
        if (string == null) {
            string = "3.4.0";
        }
        string2 = string2 + " API Version " + string;
        System.out.println(string2);
        String string8 = string = package_ != null ? package_.getImplementationVersion() : "3.4.0 (package information missing)";
        if (string == null) {
            string = "3.4.0 (package information missing)";
        }
        System.out.println("Version: " + string);
        System.out.println(" Native: " + Native.getNativeVersion() + " (" + Native.getAPIChecksum() + ")");
        System.exit(0);
    }

    static synchronized native void freeNativeCallback(long var0);

    static synchronized native long createNativeCallback(Callback var0, Method var1, Class[] var2, Class var3, int var4, boolean var5);

    static native int invokeInt(long var0, int var2, Object[] var3);

    static native long invokeLong(long var0, int var2, Object[] var3);

    static native void invokeVoid(long var0, int var2, Object[] var3);

    static native float invokeFloat(long var0, int var2, Object[] var3);

    static native double invokeDouble(long var0, int var2, Object[] var3);

    static native long invokePointer(long var0, int var2, Object[] var3);

    private static native void invokeStructure(long var0, int var2, Object[] var3, long var4, long var6);

    static bd a(long l2, int n2, Object[] arrobject, bd bd2) {
        Native.invokeStructure(l2, n2, arrobject, bd2.g().J, bd2.n().J);
        return bd2;
    }

    static native Object invokeObject(long var0, int var2, Object[] var3);

    static native long open(String var0);

    static native void close(long var0);

    static native long findSymbol(long var0, String var2);

    static native long indexOf(long var0, byte var2);

    static native void read(long var0, byte[] var2, int var3, int var4);

    static native void read(long var0, short[] var2, int var3, int var4);

    static native void read(long var0, char[] var2, int var3, int var4);

    static native void read(long var0, int[] var2, int var3, int var4);

    static native void read(long var0, long[] var2, int var3, int var4);

    static native void read(long var0, float[] var2, int var3, int var4);

    static native void read(long var0, double[] var2, int var3, int var4);

    static native void write(long var0, byte[] var2, int var3, int var4);

    static native void write(long var0, short[] var2, int var3, int var4);

    static native void write(long var0, char[] var2, int var3, int var4);

    static native void write(long var0, int[] var2, int var3, int var4);

    static native void write(long var0, long[] var2, int var3, int var4);

    static native void write(long var0, float[] var2, int var3, int var4);

    static native void write(long var0, double[] var2, int var3, int var4);

    static native byte getByte(long var0);

    static native char getChar(long var0);

    static native short getShort(long var0);

    static native int getInt(long var0);

    static native long getLong(long var0);

    static native float getFloat(long var0);

    static native double getDouble(long var0);

    static ay a(long l2) {
        long l3 = Native._getPointer(l2);
        return l3 == 0L ? null : new ay(l3);
    }

    private static native long _getPointer(long var0);

    static native String getString(long var0, boolean var2);

    static native void setMemory(long var0, long var2, byte var4);

    static native void setByte(long var0, byte var2);

    static native void setShort(long var0, short var2);

    static native void setChar(long var0, char var2);

    static native void setInt(long var0, int var2);

    static native void setLong(long var0, long var2);

    static native void setFloat(long var0, float var2);

    static native void setDouble(long var0, double var2);

    static native void setPointer(long var0, long var2);

    static native void setString(long var0, String var2, boolean var3);

    public static native long malloc(long var0);

    public static native void free(long var0);

    public static native ByteBuffer getDirectByteBuffer(long var0, long var2);

    public static void a(boolean bl2) {
        Native.setLastError(bl2 ? -1 : -2);
    }

    static void g() {
        Native.i();
    }

    static Class f(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError().initCause(classNotFoundException);
        }
    }

    static Map h() {
        return W;
    }

    static void a(Class class_, long[] arrl) {
        Native.unregister(class_, arrl);
    }

    static {
        String string;
        G = null;
        H = new WeakHashMap();
        I = new WeakHashMap();
        J = new WeakHashMap();
        K = new WeakHashMap();
        M = L = new ag();
        Native.j();
        a = Native.sizeof(0);
        b = Native.sizeof(1);
        c = Native.sizeof(2);
        d = Native.sizeof(3);
        Native.initIDs();
        if (Boolean.getBoolean("jna.protected")) {
            Native.setProtected(true);
        }
        if (!"3.4.0".equals(string = Native.getNativeVersion())) {
            String string2 = System.getProperty("line.separator");
            throw new Error(string2 + string2 + "There is an incompatible JNA native library installed on this system." + string2 + "To resolve this issue you may do one of the following:" + string2 + " - remove or uninstall the offending library" + string2 + " - set the system property jna.nosys=true" + string2 + " - set jna.boot.library.path to include the path to the version of the " + string2 + "   jnidispatch library included with the JNA jar file you are using" + string2);
        }
        Native.setPreserveLastError("true".equalsIgnoreCase(System.getProperty("jna.preserve_last_error", "true")));
        U = new ah();
        V = new ai();
        W = new HashMap();
        X = new HashMap();
        Y = new an();
    }
}

