/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.b;

import io.netty.util.c.b.e;
import java.util.HashMap;
import java.util.Map;

final class m {
    static final char a = '{';
    static final char b = '}';
    static final String c = "{}";
    private static final char d = '\\';

    static e a(String string, Object object) {
        return m.a(string, new Object[]{object});
    }

    static e a(String string, Object object, Object object2) {
        return m.a(string, new Object[]{object, object2});
    }

    static Throwable a(Object[] arrobject) {
        if (arrobject == null || arrobject.length == 0) {
            return null;
        }
        Object object = arrobject[arrobject.length - 1];
        if (object instanceof Throwable) {
            return (Throwable)object;
        }
        return null;
    }

    static e a(String string, Object[] arrobject) {
        int n2;
        Throwable throwable = m.a(arrobject);
        if (string == null) {
            return new e(null, arrobject, throwable);
        }
        if (arrobject == null) {
            return new e(string);
        }
        int n3 = 0;
        StringBuffer stringBuffer = new StringBuffer(string.length() + 50);
        for (n2 = 0; n2 < arrobject.length; ++n2) {
            int n4 = string.indexOf(c, n3);
            if (n4 == -1) {
                if (n3 == 0) {
                    return new e(string, arrobject, throwable);
                }
                stringBuffer.append(string.substring(n3, string.length()));
                return new e(stringBuffer.toString(), arrobject, throwable);
            }
            if (m.a(string, n4)) {
                if (!m.b(string, n4)) {
                    --n2;
                    stringBuffer.append(string.substring(n3, n4 - 1));
                    stringBuffer.append('{');
                    n3 = n4 + 1;
                    continue;
                }
                stringBuffer.append(string.substring(n3, n4 - 1));
                m.a(stringBuffer, arrobject[n2], new HashMap());
                n3 = n4 + 2;
                continue;
            }
            stringBuffer.append(string.substring(n3, n4));
            m.a(stringBuffer, arrobject[n2], new HashMap());
            n3 = n4 + 2;
        }
        stringBuffer.append(string.substring(n3, string.length()));
        if (n2 < arrobject.length - 1) {
            return new e(stringBuffer.toString(), arrobject, throwable);
        }
        return new e(stringBuffer.toString(), arrobject, null);
    }

    static boolean a(String string, int n2) {
        if (n2 == 0) {
            return false;
        }
        return string.charAt(n2 - 1) == '\\';
    }

    static boolean b(String string, int n2) {
        return n2 >= 2 && string.charAt(n2 - 2) == '\\';
    }

    private static void a(StringBuffer stringBuffer, Object object, Map map) {
        if (object == null) {
            stringBuffer.append("null");
            return;
        }
        if (!object.getClass().isArray()) {
            m.a(stringBuffer, object);
        } else if (object instanceof boolean[]) {
            m.a(stringBuffer, (boolean[])object);
        } else if (object instanceof byte[]) {
            m.a(stringBuffer, (byte[])object);
        } else if (object instanceof char[]) {
            m.a(stringBuffer, (char[])object);
        } else if (object instanceof short[]) {
            m.a(stringBuffer, (short[])object);
        } else if (object instanceof int[]) {
            m.a(stringBuffer, (int[])object);
        } else if (object instanceof long[]) {
            m.a(stringBuffer, (long[])object);
        } else if (object instanceof float[]) {
            m.a(stringBuffer, (float[])object);
        } else if (object instanceof double[]) {
            m.a(stringBuffer, (double[])object);
        } else {
            m.a(stringBuffer, (Object[])object, map);
        }
    }

    private static void a(StringBuffer stringBuffer, Object object) {
        try {
            String string = object.toString();
            stringBuffer.append(string);
        }
        catch (Throwable throwable) {
            System.err.println("SLF4J: Failed toString() invocation on an object of type [" + object.getClass().getName() + ']');
            throwable.printStackTrace();
            stringBuffer.append("[FAILED toString()]");
        }
    }

    private static void a(StringBuffer stringBuffer, Object[] arrobject, Map map) {
        stringBuffer.append('[');
        if (!map.containsKey(arrobject)) {
            map.put(arrobject, null);
            int n2 = arrobject.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                m.a(stringBuffer, arrobject[i2], map);
                if (i2 == n2 - 1) continue;
                stringBuffer.append(", ");
            }
            map.remove(arrobject);
        } else {
            stringBuffer.append("...");
        }
        stringBuffer.append(']');
    }

    private static void a(StringBuffer stringBuffer, boolean[] arrbl) {
        stringBuffer.append('[');
        int n2 = arrbl.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuffer.append(arrbl[i2]);
            if (i2 == n2 - 1) continue;
            stringBuffer.append(", ");
        }
        stringBuffer.append(']');
    }

    private static void a(StringBuffer stringBuffer, byte[] arrby) {
        stringBuffer.append('[');
        int n2 = arrby.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuffer.append(arrby[i2]);
            if (i2 == n2 - 1) continue;
            stringBuffer.append(", ");
        }
        stringBuffer.append(']');
    }

    private static void a(StringBuffer stringBuffer, char[] arrc) {
        stringBuffer.append('[');
        int n2 = arrc.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuffer.append(arrc[i2]);
            if (i2 == n2 - 1) continue;
            stringBuffer.append(", ");
        }
        stringBuffer.append(']');
    }

    private static void a(StringBuffer stringBuffer, short[] arrs) {
        stringBuffer.append('[');
        int n2 = arrs.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuffer.append(arrs[i2]);
            if (i2 == n2 - 1) continue;
            stringBuffer.append(", ");
        }
        stringBuffer.append(']');
    }

    private static void a(StringBuffer stringBuffer, int[] arrn) {
        stringBuffer.append('[');
        int n2 = arrn.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuffer.append(arrn[i2]);
            if (i2 == n2 - 1) continue;
            stringBuffer.append(", ");
        }
        stringBuffer.append(']');
    }

    private static void a(StringBuffer stringBuffer, long[] arrl) {
        stringBuffer.append('[');
        int n2 = arrl.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuffer.append(arrl[i2]);
            if (i2 == n2 - 1) continue;
            stringBuffer.append(", ");
        }
        stringBuffer.append(']');
    }

    private static void a(StringBuffer stringBuffer, float[] arrf) {
        stringBuffer.append('[');
        int n2 = arrf.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuffer.append(arrf[i2]);
            if (i2 == n2 - 1) continue;
            stringBuffer.append(", ");
        }
        stringBuffer.append(']');
    }

    private static void a(StringBuffer stringBuffer, double[] arrd) {
        stringBuffer.append('[');
        int n2 = arrd.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuffer.append(arrd[i2]);
            if (i2 == n2 - 1) continue;
            stringBuffer.append(", ");
        }
        stringBuffer.append(']');
    }

    private m() {
    }
}

