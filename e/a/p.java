/*
 * Decompiled with CFR 0.150.
 */
package e.a;

import e.a.e;
import e.a.f;
import e.a.g;
import e.a.q;
import e.a.r;
import e.a.s;
import e.a.t;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.ListIterator;

public class p {
    public static final Object a = new Object();
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    public static String g = ".*[mM][iI][dD][iI]?$";
    public static String h = "^[hH][tT][tT][pP]://.*";
    private static t i = null;
    private static LinkedList j;
    private static LinkedList k;
    private static LinkedList l;
    private static final Object m;
    private static int n;
    private static int o;
    private static float p;
    private static int q;
    private static float r;
    private static float s;
    private static float t;
    private static float u;
    private static String v;
    private static int w;
    private static int x;
    private static boolean y;
    private static int z;
    private static int A;
    private static boolean B;
    private static String C;

    public static void a(Class class_) {
        if (class_ == null) {
            throw new s("Parameter null in method 'addLibrary'", 2);
        }
        if (!g.class.isAssignableFrom(class_)) {
            throw new s("The specified class does not extend class 'Library' in method 'addLibrary'");
        }
        if (j == null) {
            j = new LinkedList();
        }
        if (!j.contains(class_)) {
            j.add(class_);
        }
    }

    public static void b(Class class_) {
        if (j == null || class_ == null) {
            return;
        }
        j.remove(class_);
    }

    public static LinkedList a() {
        return j;
    }

    public static boolean c(Class class_) {
        if (class_ == null) {
            e.a.p.e("Parameter 'libraryClass' null in method'librayCompatible'");
            return false;
        }
        if (!g.class.isAssignableFrom(class_)) {
            e.a.p.e("The specified class does not extend class 'Library' in method 'libraryCompatible'");
            return false;
        }
        Object object = e.a.p.a(class_, "libraryCompatible", new Class[0], new Object[0]);
        if (object == null) {
            e.a.p.e("Method 'Library.libraryCompatible' returned 'null' in method 'libraryCompatible'");
            return false;
        }
        return (Boolean)object;
    }

    public static String d(Class class_) {
        if (class_ == null) {
            e.a.p.e("Parameter 'libraryClass' null in method'getLibrayTitle'");
            return null;
        }
        if (!g.class.isAssignableFrom(class_)) {
            e.a.p.e("The specified class does not extend class 'Library' in method 'getLibraryTitle'");
            return null;
        }
        Object object = e.a.p.a(class_, "getTitle", new Class[0], new Object[0]);
        if (object == null) {
            e.a.p.e("Method 'Library.getTitle' returned 'null' in method 'getLibraryTitle'");
            return null;
        }
        return (String)object;
    }

    public static String e(Class class_) {
        if (class_ == null) {
            e.a.p.e("Parameter 'libraryClass' null in method'getLibrayDescription'");
            return null;
        }
        if (!g.class.isAssignableFrom(class_)) {
            e.a.p.e("The specified class does not extend class 'Library' in method 'getLibraryDescription'");
            return null;
        }
        Object object = e.a.p.a(class_, "getDescription", new Class[0], new Object[0]);
        if (object == null) {
            e.a.p.e("Method 'Library.getDescription' returned 'null' in method 'getLibraryDescription'");
            return null;
        }
        return (String)object;
    }

    public static boolean f(Class class_) {
        if (class_ == null) {
            e.a.p.e("Parameter 'libraryClass' null in method'reverseByteOrder'");
            return false;
        }
        if (!g.class.isAssignableFrom(class_)) {
            e.a.p.e("The specified class does not extend class 'Library' in method 'reverseByteOrder'");
            return false;
        }
        Object object = e.a.p.a(class_, "reversByteOrder", new Class[0], new Object[0]);
        if (object == null) {
            e.a.p.e("Method 'Library.reverseByteOrder' returned 'null' in method 'getLibraryDescription'");
            return false;
        }
        return (Boolean)object;
    }

    public static void a(t t2) {
        i = t2;
    }

    public static t b() {
        return i;
    }

    public static synchronized void a(int n2) {
        n = n2;
    }

    public static synchronized int c() {
        return n;
    }

    public static synchronized void b(int n2) {
        o = n2;
    }

    public static synchronized int d() {
        return o;
    }

    public static synchronized void a(float f2) {
        p = f2;
    }

    public static synchronized float e() {
        return p;
    }

    public static synchronized void c(int n2) {
        q = n2;
    }

    public static synchronized int f() {
        return q;
    }

    public static synchronized void b(float f2) {
        r = f2;
    }

    public static synchronized float g() {
        return s;
    }

    public static synchronized void c(float f2) {
        s = f2;
    }

    public static synchronized float h() {
        return t;
    }

    public static synchronized void d(float f2) {
        t = f2;
    }

    public static synchronized float i() {
        return r;
    }

    public static synchronized void e(float f2) {
        u = f2;
    }

    public static synchronized float j() {
        return u;
    }

    public static synchronized void a(String string) {
        v = string;
    }

    public static synchronized String k() {
        return v;
    }

    public static synchronized void d(int n2) {
        w = n2;
    }

    public static synchronized int l() {
        return w;
    }

    public static synchronized void e(int n2) {
        x = n2;
    }

    public static synchronized int m() {
        return x;
    }

    public static synchronized void a(boolean bl2) {
        y = bl2;
    }

    public static synchronized boolean n() {
        return y;
    }

    public static synchronized void f(int n2) {
        z = n2;
    }

    public static synchronized int o() {
        return z;
    }

    public static synchronized void g(int n2) {
        A = n2;
    }

    public static synchronized int p() {
        return A;
    }

    public static synchronized String q() {
        return C;
    }

    public static synchronized void b(String string) {
        C = string;
    }

    public static synchronized void a(String string, Class class_) {
        if (string == null) {
            throw new s("Parameter 'extension' null in method 'setCodec'.", 2);
        }
        if (class_ == null) {
            throw new s("Parameter 'iCodecClass' null in method 'setCodec'.", 2);
        }
        if (!e.class.isAssignableFrom(class_)) {
            throw new s("The specified class does not implement interface 'ICodec' in method 'setCodec'", 3);
        }
        if (k == null) {
            k = new LinkedList();
        }
        ListIterator listIterator = k.listIterator();
        while (listIterator.hasNext()) {
            r r2 = (r)listIterator.next();
            if (!string.matches(r2.a)) continue;
            listIterator.remove();
        }
        k.add(new r(string, class_));
        if (string.matches(g)) {
            B = true;
        }
    }

    public static synchronized e c(String string) {
        if (k == null) {
            return null;
        }
        ListIterator listIterator = k.listIterator();
        while (listIterator.hasNext()) {
            r r2 = (r)listIterator.next();
            if (!string.matches(r2.a)) continue;
            return r2.a();
        }
        return null;
    }

    public static boolean r() {
        return B;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(f f2) {
        Object object = m;
        synchronized (object) {
            if (l == null) {
                l = new LinkedList();
            }
            if (!l.contains(f2)) {
                l.add(f2);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void b(f f2) {
        Object object = m;
        synchronized (object) {
            if (l == null) {
                l = new LinkedList();
            }
            if (l.contains(f2)) {
                l.remove(f2);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(String string, int n2) {
        Object object = m;
        synchronized (object) {
            if (l == null) {
                return;
            }
        }
        object = string;
        int n3 = n2;
        new q((String)object, n3).start();
    }

    private static void e(String string) {
        if (i != null) {
            i.a("SoundSystemConfig", string, 0);
        }
    }

    private static Object a(Class class_, String string, Class[] arrclass, Object[] arrobject) {
        Method method = null;
        try {
            method = class_.getMethod(string, arrclass);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            e.a.p.e("NoSuchMethodException thrown when attempting to call method '" + string + "' in " + "method 'runMethod'");
            return null;
        }
        catch (SecurityException securityException) {
            e.a.p.e("Access denied when attempting to call method '" + string + "' in method 'runMethod'");
            return null;
        }
        catch (NullPointerException nullPointerException) {
            e.a.p.e("NullPointerException thrown when attempting to call method '" + string + "' in " + "method 'runMethod'");
            return null;
        }
        if (method == null) {
            e.a.p.e("Method '" + string + "' not found for the class " + "specified in method 'runMethod'");
            return null;
        }
        Object object = null;
        try {
            object = method.invoke(null, arrobject);
        }
        catch (IllegalAccessException illegalAccessException) {
            e.a.p.e("IllegalAccessException thrown when attempting to invoke method '" + string + "' in " + "method 'runMethod'");
            return null;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            e.a.p.e("IllegalArgumentException thrown when attempting to invoke method '" + string + "' in " + "method 'runMethod'");
            return null;
        }
        catch (InvocationTargetException invocationTargetException) {
            e.a.p.e("InvocationTargetException thrown while attempting to invoke method 'Library.getTitle' in method 'getLibraryTitle'");
            return null;
        }
        catch (NullPointerException nullPointerException) {
            e.a.p.e("NullPointerException thrown when attempting to invoke method '" + string + "' in " + "method 'runMethod'");
            return null;
        }
        catch (ExceptionInInitializerError exceptionInInitializerError) {
            e.a.p.e("ExceptionInInitializerError thrown when attempting to invoke method '" + string + "' in " + "method 'runMethod'");
            return null;
        }
        return object;
    }

    static /* synthetic */ Object s() {
        return m;
    }

    static /* synthetic */ LinkedList t() {
        return l;
    }

    static /* synthetic */ void d(String string) {
        e.a.p.e(string);
    }

    static {
        k = null;
        l = null;
        m = new Object();
        n = 28;
        o = 4;
        p = 1.0f;
        q = 1;
        r = 0.03f;
        s = 0.0f;
        t = 1.0f;
        u = 1000.0f;
        v = "Sounds/";
        w = 131072;
        x = 3;
        y = false;
        z = 0x10000000;
        A = 0x100000;
        B = false;
        C = "";
    }
}

