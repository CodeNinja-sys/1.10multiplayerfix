/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c;

import java.util.Random;

public class ac {
    private static final Random a = new Random();

    public static String a(int n2) {
        return ac.a(n2, false, false);
    }

    public static String b(int n2) {
        return ac.a(n2, 32, 127, false, false);
    }

    public static String c(int n2) {
        return ac.a(n2, true, false);
    }

    public static String d(int n2) {
        return ac.a(n2, true, true);
    }

    public static String e(int n2) {
        return ac.a(n2, false, true);
    }

    public static String a(int n2, boolean bl2, boolean bl3) {
        return ac.a(n2, 0, 0, bl2, bl3);
    }

    public static String a(int n2, int n3, int n4, boolean bl2, boolean bl3) {
        return ac.a(n2, n3, n4, bl2, bl3, null, a);
    }

    public static String a(int n2, int n3, int n4, boolean bl2, boolean bl3, char ... arrc) {
        return ac.a(n2, n3, n4, bl2, bl3, arrc, a);
    }

    public static String a(int n2, int n3, int n4, boolean bl2, boolean bl3, char[] arrc, Random random) {
        if (n2 == 0) {
            return "";
        }
        if (n2 < 0) {
            throw new IllegalArgumentException("Requested random string length " + n2 + " is less than 0.");
        }
        if (arrc != null && arrc.length == 0) {
            throw new IllegalArgumentException("The chars array must not be empty");
        }
        if (n3 == 0 && n4 == 0) {
            if (arrc != null) {
                n4 = arrc.length;
            } else if (!bl2 && !bl3) {
                n4 = Integer.MAX_VALUE;
            } else {
                n4 = 123;
                n3 = 32;
            }
        } else if (n4 <= n3) {
            throw new IllegalArgumentException("Parameter end (" + n4 + ") must be greater than start (" + n3 + ")");
        }
        char[] arrc2 = new char[n2];
        int n5 = n4 - n3;
        while (n2-- != 0) {
            char c2 = arrc == null ? (char)(random.nextInt(n5) + n3) : arrc[random.nextInt(n5) + n3];
            if (bl2 && Character.isLetter(c2) || bl3 && Character.isDigit(c2) || !bl2 && !bl3) {
                if (c2 >= '\udc00' && c2 <= '\udfff') {
                    if (n2 == 0) {
                        ++n2;
                        continue;
                    }
                    arrc2[n2] = c2;
                    arrc2[--n2] = (char)(55296 + random.nextInt(128));
                    continue;
                }
                if (c2 >= '\ud800' && c2 <= '\udb7f') {
                    if (n2 == 0) {
                        ++n2;
                        continue;
                    }
                    arrc2[n2] = (char)(56320 + random.nextInt(128));
                    arrc2[--n2] = c2;
                    continue;
                }
                if (c2 >= '\udb80' && c2 <= '\udbff') {
                    ++n2;
                    continue;
                }
                arrc2[n2] = c2;
                continue;
            }
            ++n2;
        }
        return new String(arrc2);
    }

    public static String a(int n2, String string) {
        if (string == null) {
            return ac.a(n2, 0, 0, false, false, null, a);
        }
        return ac.a(n2, string.toCharArray());
    }

    public static String a(int n2, char ... arrc) {
        if (arrc == null) {
            return ac.a(n2, 0, 0, false, false, null, a);
        }
        return ac.a(n2, 0, arrc.length, false, false, arrc, a);
    }
}

