/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.d;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import org.apache.commons.c.am;
import org.apache.commons.c.an;
import org.apache.commons.c.c;
import org.apache.commons.c.o;

public class f {
    static final String a = " [wrapped] ";
    private static final String[] b = new String[]{"getCause", "getNextException", "getTargetException", "getException", "getSourceException", "getRootCause", "getCausedByException", "getNested", "getLinkedException", "getNestedException", "getLinkedCause", "getThrowable"};

    public static String[] a() {
        return (String[])c.c(b);
    }

    public static Throwable a(Throwable throwable) {
        return f.a(throwable, b);
    }

    public static Throwable a(Throwable throwable, String[] arrstring) {
        if (throwable == null) {
            return null;
        }
        if (arrstring == null) {
            arrstring = b;
        }
        for (String string : arrstring) {
            Throwable throwable2;
            if (string == null || (throwable2 = f.a(throwable, string)) == null) continue;
            return throwable2;
        }
        return null;
    }

    public static Throwable b(Throwable throwable) {
        List list = f.e(throwable);
        return list.size() < 2 ? null : (Throwable)list.get(list.size() - 1);
    }

    private static Throwable a(Throwable throwable, String string) {
        Method method = null;
        try {
            method = throwable.getClass().getMethod(string, new Class[0]);
        }
        catch (NoSuchMethodException noSuchMethodException) {
        }
        catch (SecurityException securityException) {
            // empty catch block
        }
        if (method != null && Throwable.class.isAssignableFrom(method.getReturnType())) {
            try {
                return (Throwable)method.invoke(throwable, new Object[0]);
            }
            catch (IllegalAccessException illegalAccessException) {
            }
            catch (IllegalArgumentException illegalArgumentException) {
            }
            catch (InvocationTargetException invocationTargetException) {
                // empty catch block
            }
        }
        return null;
    }

    public static int c(Throwable throwable) {
        return f.e(throwable).size();
    }

    public static Throwable[] d(Throwable throwable) {
        List list = f.e(throwable);
        return list.toArray(new Throwable[list.size()]);
    }

    public static List e(Throwable throwable) {
        ArrayList<Throwable> arrayList = new ArrayList<Throwable>();
        while (throwable != null && !arrayList.contains(throwable)) {
            arrayList.add(throwable);
            throwable = f.a(throwable);
        }
        return arrayList;
    }

    public static int a(Throwable throwable, Class class_) {
        return f.a(throwable, class_, 0, false);
    }

    public static int a(Throwable throwable, Class class_, int n2) {
        return f.a(throwable, class_, n2, false);
    }

    public static int b(Throwable throwable, Class class_) {
        return f.a(throwable, class_, 0, true);
    }

    public static int b(Throwable throwable, Class class_, int n2) {
        return f.a(throwable, class_, n2, true);
    }

    private static int a(Throwable throwable, Class class_, int n2, boolean bl2) {
        Throwable[] arrthrowable;
        if (throwable == null || class_ == null) {
            return -1;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        if (n2 >= (arrthrowable = f.d(throwable)).length) {
            return -1;
        }
        if (bl2) {
            for (int i2 = n2; i2 < arrthrowable.length; ++i2) {
                if (!class_.isAssignableFrom(arrthrowable[i2].getClass())) continue;
                return i2;
            }
        } else {
            for (int i3 = n2; i3 < arrthrowable.length; ++i3) {
                if (!class_.equals(arrthrowable[i3].getClass())) continue;
                return i3;
            }
        }
        return -1;
    }

    public static void f(Throwable throwable) {
        f.a(throwable, System.err);
    }

    public static void a(Throwable throwable, PrintStream printStream) {
        String[] arrstring;
        if (throwable == null) {
            return;
        }
        if (printStream == null) {
            throw new IllegalArgumentException("The PrintStream must not be null");
        }
        for (String string : arrstring = f.g(throwable)) {
            printStream.println(string);
        }
        printStream.flush();
    }

    public static void a(Throwable throwable, PrintWriter printWriter) {
        String[] arrstring;
        if (throwable == null) {
            return;
        }
        if (printWriter == null) {
            throw new IllegalArgumentException("The PrintWriter must not be null");
        }
        for (String string : arrstring = f.g(throwable)) {
            printWriter.println(string);
        }
        printWriter.flush();
    }

    public static String[] g(Throwable throwable) {
        if (throwable == null) {
            return c.c;
        }
        Throwable[] arrthrowable = f.d(throwable);
        int n2 = arrthrowable.length;
        ArrayList<String> arrayList = new ArrayList<String>();
        List list = f.j(arrthrowable[n2 - 1]);
        int n3 = n2;
        while (--n3 >= 0) {
            List list2 = list;
            if (n3 != 0) {
                list = f.j(arrthrowable[n3 - 1]);
                f.a(list2, list);
            }
            if (n3 == n2 - 1) {
                arrayList.add(arrthrowable[n3].toString());
            } else {
                arrayList.add(a + arrthrowable[n3].toString());
            }
            for (int i2 = 0; i2 < list2.size(); ++i2) {
                arrayList.add((String)list2.get(i2));
            }
        }
        return arrayList.toArray(new String[arrayList.size()]);
    }

    public static void a(List list, List list2) {
        if (list == null || list2 == null) {
            throw new IllegalArgumentException("The List must not be null");
        }
        int n2 = list.size() - 1;
        for (int i2 = list2.size() - 1; n2 >= 0 && i2 >= 0; --n2, --i2) {
            String string;
            String string2 = (String)list.get(n2);
            if (!string2.equals(string = (String)list2.get(i2))) continue;
            list.remove(n2);
        }
    }

    public static String h(Throwable throwable) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter, true);
        throwable.printStackTrace(printWriter);
        return stringWriter.getBuffer().toString();
    }

    public static String[] i(Throwable throwable) {
        if (throwable == null) {
            return c.c;
        }
        return f.a(f.h(throwable));
    }

    static String[] a(String string) {
        String string2 = an.F;
        StringTokenizer stringTokenizer = new StringTokenizer(string, string2);
        ArrayList<String> arrayList = new ArrayList<String>();
        while (stringTokenizer.hasMoreTokens()) {
            arrayList.add(stringTokenizer.nextToken());
        }
        return arrayList.toArray(new String[arrayList.size()]);
    }

    static List j(Throwable throwable) {
        String string = f.h(throwable);
        String string2 = an.F;
        StringTokenizer stringTokenizer = new StringTokenizer(string, string2);
        ArrayList<String> arrayList = new ArrayList<String>();
        boolean bl2 = false;
        while (stringTokenizer.hasMoreTokens()) {
            String string3 = stringTokenizer.nextToken();
            int n2 = string3.indexOf("at");
            if (n2 != -1 && string3.substring(0, n2).trim().isEmpty()) {
                bl2 = true;
                arrayList.add(string3);
                continue;
            }
            if (!bl2) continue;
            break;
        }
        return arrayList;
    }

    public static String k(Throwable throwable) {
        if (throwable == null) {
            return "";
        }
        String string = o.a((Object)throwable, null);
        String string2 = throwable.getMessage();
        return string + ": " + am.t(string2);
    }

    public static String l(Throwable throwable) {
        Throwable throwable2 = f.b(throwable);
        throwable2 = throwable2 == null ? throwable : throwable2;
        return f.k(throwable2);
    }
}

