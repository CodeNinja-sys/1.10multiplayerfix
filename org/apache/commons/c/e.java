/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c;

import org.apache.commons.c.c;

public class e {
    public static Boolean a(Boolean bl2) {
        if (bl2 == null) {
            return null;
        }
        return bl2 != false ? Boolean.FALSE : Boolean.TRUE;
    }

    public static boolean b(Boolean bl2) {
        return Boolean.TRUE.equals(bl2);
    }

    public static boolean c(Boolean bl2) {
        return !e.b(bl2);
    }

    public static boolean d(Boolean bl2) {
        return Boolean.FALSE.equals(bl2);
    }

    public static boolean e(Boolean bl2) {
        return !e.d(bl2);
    }

    public static boolean f(Boolean bl2) {
        return bl2 != null && bl2 != false;
    }

    public static boolean a(Boolean bl2, boolean bl3) {
        if (bl2 == null) {
            return bl3;
        }
        return bl2;
    }

    public static boolean a(int n2) {
        return n2 != 0;
    }

    public static Boolean b(int n2) {
        return n2 == 0 ? Boolean.FALSE : Boolean.TRUE;
    }

    public static Boolean a(Integer n2) {
        if (n2 == null) {
            return null;
        }
        return n2 == 0 ? Boolean.FALSE : Boolean.TRUE;
    }

    public static boolean a(int n2, int n3, int n4) {
        if (n2 == n3) {
            return true;
        }
        if (n2 == n4) {
            return false;
        }
        throw new IllegalArgumentException("The Integer did not match either specified value");
    }

    public static boolean a(Integer n2, Integer n3, Integer n4) {
        if (n2 == null) {
            if (n3 == null) {
                return true;
            }
            if (n4 == null) {
                return false;
            }
        } else {
            if (n2.equals(n3)) {
                return true;
            }
            if (n2.equals(n4)) {
                return false;
            }
        }
        throw new IllegalArgumentException("The Integer did not match either specified value");
    }

    public static Boolean a(int n2, int n3, int n4, int n5) {
        if (n2 == n3) {
            return Boolean.TRUE;
        }
        if (n2 == n4) {
            return Boolean.FALSE;
        }
        if (n2 == n5) {
            return null;
        }
        throw new IllegalArgumentException("The Integer did not match any specified value");
    }

    public static Boolean a(Integer n2, Integer n3, Integer n4, Integer n5) {
        if (n2 == null) {
            if (n3 == null) {
                return Boolean.TRUE;
            }
            if (n4 == null) {
                return Boolean.FALSE;
            }
            if (n5 == null) {
                return null;
            }
        } else {
            if (n2.equals(n3)) {
                return Boolean.TRUE;
            }
            if (n2.equals(n4)) {
                return Boolean.FALSE;
            }
            if (n2.equals(n5)) {
                return null;
            }
        }
        throw new IllegalArgumentException("The Integer did not match any specified value");
    }

    public static int a(boolean bl2) {
        return bl2 ? 1 : 0;
    }

    public static Integer b(boolean bl2) {
        return bl2 ? org.apache.commons.c.e.c.e : org.apache.commons.c.e.c.d;
    }

    public static Integer g(Boolean bl2) {
        if (bl2 == null) {
            return null;
        }
        return bl2 != false ? org.apache.commons.c.e.c.e : org.apache.commons.c.e.c.d;
    }

    public static int a(boolean bl2, int n2, int n3) {
        return bl2 ? n2 : n3;
    }

    public static int a(Boolean bl2, int n2, int n3, int n4) {
        if (bl2 == null) {
            return n4;
        }
        return bl2 != false ? n2 : n3;
    }

    public static Integer a(boolean bl2, Integer n2, Integer n3) {
        return bl2 ? n2 : n3;
    }

    public static Integer a(Boolean bl2, Integer n2, Integer n3, Integer n4) {
        if (bl2 == null) {
            return n4;
        }
        return bl2 != false ? n2 : n3;
    }

    public static Boolean a(String string) {
        if (string == "true") {
            return Boolean.TRUE;
        }
        if (string == null) {
            return null;
        }
        switch (string.length()) {
            case 1: {
                char c2 = string.charAt(0);
                if (c2 == 'y' || c2 == 'Y' || c2 == 't' || c2 == 'T') {
                    return Boolean.TRUE;
                }
                if (c2 != 'n' && c2 != 'N' && c2 != 'f' && c2 != 'F') break;
                return Boolean.FALSE;
            }
            case 2: {
                char c3 = string.charAt(0);
                char c4 = string.charAt(1);
                if (!(c3 != 'o' && c3 != 'O' || c4 != 'n' && c4 != 'N')) {
                    return Boolean.TRUE;
                }
                if (c3 != 'n' && c3 != 'N' || c4 != 'o' && c4 != 'O') break;
                return Boolean.FALSE;
            }
            case 3: {
                char c5 = string.charAt(0);
                char c6 = string.charAt(1);
                char c7 = string.charAt(2);
                if (!(c5 != 'y' && c5 != 'Y' || c6 != 'e' && c6 != 'E' || c7 != 's' && c7 != 'S')) {
                    return Boolean.TRUE;
                }
                if (c5 != 'o' && c5 != 'O' || c6 != 'f' && c6 != 'F' || c7 != 'f' && c7 != 'F') break;
                return Boolean.FALSE;
            }
            case 4: {
                char c8 = string.charAt(0);
                char c9 = string.charAt(1);
                char c10 = string.charAt(2);
                char c11 = string.charAt(3);
                if (c8 != 't' && c8 != 'T' || c9 != 'r' && c9 != 'R' || c10 != 'u' && c10 != 'U' || c11 != 'e' && c11 != 'E') break;
                return Boolean.TRUE;
            }
            case 5: {
                char c12 = string.charAt(0);
                char c13 = string.charAt(1);
                char c14 = string.charAt(2);
                char c15 = string.charAt(3);
                char c16 = string.charAt(4);
                if (c12 != 'f' && c12 != 'F' || c13 != 'a' && c13 != 'A' || c14 != 'l' && c14 != 'L' || c15 != 's' && c15 != 'S' || c16 != 'e' && c16 != 'E') break;
                return Boolean.FALSE;
            }
        }
        return null;
    }

    public static Boolean a(String string, String string2, String string3, String string4) {
        if (string == null) {
            if (string2 == null) {
                return Boolean.TRUE;
            }
            if (string3 == null) {
                return Boolean.FALSE;
            }
            if (string4 == null) {
                return null;
            }
        } else {
            if (string.equals(string2)) {
                return Boolean.TRUE;
            }
            if (string.equals(string3)) {
                return Boolean.FALSE;
            }
            if (string.equals(string4)) {
                return null;
            }
        }
        throw new IllegalArgumentException("The String did not match any specified value");
    }

    public static boolean b(String string) {
        return e.a(string) == Boolean.TRUE;
    }

    public static boolean a(String string, String string2, String string3) {
        if (string == string2) {
            return true;
        }
        if (string == string3) {
            return false;
        }
        if (string != null) {
            if (string.equals(string2)) {
                return true;
            }
            if (string.equals(string3)) {
                return false;
            }
        }
        throw new IllegalArgumentException("The String did not match either specified value");
    }

    public static String h(Boolean bl2) {
        return e.a(bl2, "true", "false", null);
    }

    public static String i(Boolean bl2) {
        return e.a(bl2, "on", "off", null);
    }

    public static String j(Boolean bl2) {
        return e.a(bl2, "yes", "no", null);
    }

    public static String a(Boolean bl2, String string, String string2, String string3) {
        if (bl2 == null) {
            return string3;
        }
        return bl2 != false ? string : string2;
    }

    public static String c(boolean bl2) {
        return e.a(bl2, "true", "false");
    }

    public static String d(boolean bl2) {
        return e.a(bl2, "on", "off");
    }

    public static String e(boolean bl2) {
        return e.a(bl2, "yes", "no");
    }

    public static String a(boolean bl2, String string, String string2) {
        return bl2 ? string : string2;
    }

    public static boolean a(boolean ... arrbl) {
        if (arrbl == null) {
            throw new IllegalArgumentException("The Array must not be null");
        }
        if (arrbl.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        for (boolean bl2 : arrbl) {
            if (bl2) continue;
            return false;
        }
        return true;
    }

    public static Boolean a(Boolean ... arrboolean) {
        if (arrboolean == null) {
            throw new IllegalArgumentException("The Array must not be null");
        }
        if (arrboolean.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        try {
            boolean[] arrbl = c.b(arrboolean);
            return e.a(arrbl) ? Boolean.TRUE : Boolean.FALSE;
        }
        catch (NullPointerException nullPointerException) {
            throw new IllegalArgumentException("The array must not contain any null elements");
        }
    }

    public static boolean b(boolean ... arrbl) {
        if (arrbl == null) {
            throw new IllegalArgumentException("The Array must not be null");
        }
        if (arrbl.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        for (boolean bl2 : arrbl) {
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    public static Boolean b(Boolean ... arrboolean) {
        if (arrboolean == null) {
            throw new IllegalArgumentException("The Array must not be null");
        }
        if (arrboolean.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        try {
            boolean[] arrbl = c.b(arrboolean);
            return e.b(arrbl) ? Boolean.TRUE : Boolean.FALSE;
        }
        catch (NullPointerException nullPointerException) {
            throw new IllegalArgumentException("The array must not contain any null elements");
        }
    }

    public static boolean c(boolean ... arrbl) {
        if (arrbl == null) {
            throw new IllegalArgumentException("The Array must not be null");
        }
        if (arrbl.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        boolean bl2 = false;
        for (boolean bl3 : arrbl) {
            bl2 ^= bl3;
        }
        return bl2;
    }

    public static Boolean c(Boolean ... arrboolean) {
        if (arrboolean == null) {
            throw new IllegalArgumentException("The Array must not be null");
        }
        if (arrboolean.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        try {
            boolean[] arrbl = c.b(arrboolean);
            return e.c(arrbl) ? Boolean.TRUE : Boolean.FALSE;
        }
        catch (NullPointerException nullPointerException) {
            throw new IllegalArgumentException("The array must not contain any null elements");
        }
    }
}

