/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

public final class cl {
    private cl() {
    }

    public static void a(boolean bl2) {
        if (!bl2) {
            throw new IllegalArgumentException();
        }
    }

    public static void a(boolean bl2, Object object) {
        if (!bl2) {
            throw new IllegalArgumentException(String.valueOf(object));
        }
    }

    public static void a(boolean bl2, String string, Object ... arrobject) {
        if (!bl2) {
            throw new IllegalArgumentException(cl.a(string, arrobject));
        }
    }

    public static void b(boolean bl2) {
        if (!bl2) {
            throw new IllegalStateException();
        }
    }

    public static void b(boolean bl2, Object object) {
        if (!bl2) {
            throw new IllegalStateException(String.valueOf(object));
        }
    }

    public static void b(boolean bl2, String string, Object ... arrobject) {
        if (!bl2) {
            throw new IllegalStateException(cl.a(string, arrobject));
        }
    }

    public static Object a(Object object) {
        if (object == null) {
            throw new NullPointerException();
        }
        return object;
    }

    public static Object a(Object object, Object object2) {
        if (object == null) {
            throw new NullPointerException(String.valueOf(object2));
        }
        return object;
    }

    public static Object a(Object object, String string, Object ... arrobject) {
        if (object == null) {
            throw new NullPointerException(cl.a(string, arrobject));
        }
        return object;
    }

    public static int a(int n2, int n3) {
        return cl.a(n2, n3, "index");
    }

    public static int a(int n2, int n3, String string) {
        if (n2 < 0 || n2 >= n3) {
            throw new IndexOutOfBoundsException(cl.c(n2, n3, string));
        }
        return n2;
    }

    private static String c(int n2, int n3, String string) {
        if (n2 < 0) {
            return cl.a("%s (%s) must not be negative", string, n2);
        }
        if (n3 < 0) {
            throw new IllegalArgumentException("negative size: " + n3);
        }
        return cl.a("%s (%s) must be less than size (%s)", string, n2, n3);
    }

    public static int b(int n2, int n3) {
        return cl.b(n2, n3, "index");
    }

    public static int b(int n2, int n3, String string) {
        if (n2 < 0 || n2 > n3) {
            throw new IndexOutOfBoundsException(cl.d(n2, n3, string));
        }
        return n2;
    }

    private static String d(int n2, int n3, String string) {
        if (n2 < 0) {
            return cl.a("%s (%s) must not be negative", string, n2);
        }
        if (n3 < 0) {
            throw new IllegalArgumentException("negative size: " + n3);
        }
        return cl.a("%s (%s) must not be greater than size (%s)", string, n2, n3);
    }

    public static void a(int n2, int n3, int n4) {
        if (n2 < 0 || n3 < n2 || n3 > n4) {
            throw new IndexOutOfBoundsException(cl.b(n2, n3, n4));
        }
    }

    private static String b(int n2, int n3, int n4) {
        if (n2 < 0 || n2 > n4) {
            return cl.d(n2, n4, "start index");
        }
        if (n3 < 0 || n3 > n4) {
            return cl.d(n3, n4, "end index");
        }
        return cl.a("end index (%s) must not be less than start index (%s)", n3, n2);
    }

    static String a(String string, Object ... arrobject) {
        int n2;
        string = String.valueOf(string);
        StringBuilder stringBuilder = new StringBuilder(string.length() + 16 * arrobject.length);
        int n3 = 0;
        int n4 = 0;
        while (n4 < arrobject.length && (n2 = string.indexOf("%s", n3)) != -1) {
            stringBuilder.append(string.substring(n3, n2));
            stringBuilder.append(arrobject[n4++]);
            n3 = n2 + 2;
        }
        stringBuilder.append(string.substring(n3));
        if (n4 < arrobject.length) {
            stringBuilder.append(" [");
            stringBuilder.append(arrobject[n4++]);
            while (n4 < arrobject.length) {
                stringBuilder.append(", ");
                stringBuilder.append(arrobject[n4++]);
            }
            stringBuilder.append(']');
        }
        return stringBuilder.toString();
    }
}

