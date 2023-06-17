/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c;

import io.netty.util.c.u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;

public final class ad {
    public static final String a;
    private static final String[] c;
    private static final String[] d;
    private static final String e = "";

    public static String[] a(String string, char c2) {
        int n2;
        int n3 = string.length();
        ArrayList<String> arrayList = new ArrayList<String>();
        int n4 = 0;
        for (n2 = 0; n2 < n3; ++n2) {
            if (string.charAt(n2) != c2) continue;
            if (n4 == n2) {
                arrayList.add(e);
            } else {
                arrayList.add(string.substring(n4, n2));
            }
            n4 = n2 + 1;
        }
        if (n4 == 0) {
            arrayList.add(string);
        } else if (n4 != n3) {
            arrayList.add(string.substring(n4, n3));
        } else {
            for (n2 = arrayList.size() - 1; n2 >= 0 && ((String)arrayList.get(n2)).isEmpty(); --n2) {
                arrayList.remove(n2);
            }
        }
        return arrayList.toArray(new String[arrayList.size()]);
    }

    public static String a(int n2) {
        return c[n2 & 0xFF];
    }

    public static Appendable a(Appendable appendable, int n2) {
        try {
            appendable.append(ad.a(n2));
        }
        catch (IOException iOException) {
            u.a(iOException);
        }
        return appendable;
    }

    public static String a(byte[] arrby) {
        return ad.a(arrby, 0, arrby.length);
    }

    public static String a(byte[] arrby, int n2, int n3) {
        return ((StringBuilder)ad.a(new StringBuilder(n3 << 1), arrby, n2, n3)).toString();
    }

    public static Appendable a(Appendable appendable, byte[] arrby) {
        return ad.a(appendable, arrby, 0, arrby.length);
    }

    public static Appendable a(Appendable appendable, byte[] arrby, int n2, int n3) {
        int n4 = n2 + n3;
        for (int i2 = n2; i2 < n4; ++i2) {
            ad.a(appendable, arrby[i2]);
        }
        return appendable;
    }

    public static String b(int n2) {
        return d[n2 & 0xFF];
    }

    public static Appendable b(Appendable appendable, int n2) {
        try {
            appendable.append(ad.b(n2));
        }
        catch (IOException iOException) {
            u.a(iOException);
        }
        return appendable;
    }

    public static String b(byte[] arrby) {
        return ad.b(arrby, 0, arrby.length);
    }

    public static String b(byte[] arrby, int n2, int n3) {
        return ((StringBuilder)ad.b(new StringBuilder(n3 << 1), arrby, n2, n3)).toString();
    }

    public static Appendable b(Appendable appendable, byte[] arrby) {
        return ad.b(appendable, arrby, 0, arrby.length);
    }

    public static Appendable b(Appendable appendable, byte[] arrby, int n2, int n3) {
        int n4;
        assert (n3 >= 0);
        if (n3 == 0) {
            return appendable;
        }
        int n5 = n2 + n3;
        int n6 = n5 - 1;
        for (n4 = n2; n4 < n6 && arrby[n4] == 0; ++n4) {
        }
        ad.b(appendable, arrby[n4++]);
        int n7 = n5 - n4;
        ad.a(appendable, arrby, n4, n7);
        return appendable;
    }

    public static String a(Object object) {
        if (object == null) {
            return "null_object";
        }
        return ad.a(object.getClass());
    }

    public static String a(Class class_) {
        if (class_ == null) {
            return "null_class";
        }
        Package package_ = class_.getPackage();
        if (package_ != null) {
            return class_.getName().substring(package_.getName().length() + 1);
        }
        return class_.getName();
    }

    private ad() {
    }

    static {
        StringBuilder stringBuilder;
        int n2;
        String string;
        c = new String[256];
        d = new String[256];
        try {
            string = new Formatter().format("%n", new Object[0]).toString();
        }
        catch (Exception exception) {
            string = "\n";
        }
        a = string;
        for (n2 = 0; n2 < 10; ++n2) {
            stringBuilder = new StringBuilder(2);
            stringBuilder.append('0');
            stringBuilder.append(n2);
            ad.c[n2] = stringBuilder.toString();
            ad.d[n2] = String.valueOf(n2);
        }
        while (n2 < 16) {
            stringBuilder = new StringBuilder(2);
            char c2 = (char)(97 + n2 - 10);
            stringBuilder.append('0');
            stringBuilder.append(c2);
            ad.c[n2] = stringBuilder.toString();
            ad.d[n2] = String.valueOf(c2);
            ++n2;
        }
        while (n2 < c.length) {
            String string2;
            stringBuilder = new StringBuilder(2);
            stringBuilder.append(Integer.toHexString(n2));
            ad.c[n2] = string2 = stringBuilder.toString();
            ad.d[n2] = string2;
            ++n2;
        }
    }
}

