/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;
import org.apache.commons.b.r;

public class p {
    public static final char a = '.';
    public static final String b = Character.toString('.');
    private static final char c = '/';
    private static final char d = '\\';
    private static final char e = File.separatorChar;
    private static final char f = p.a() ? (char)47 : (char)92;

    static boolean a() {
        return e == '\\';
    }

    private static boolean a(char c2) {
        return c2 == '/' || c2 == '\\';
    }

    public static String a(String string) {
        return p.a(string, e, true);
    }

    public static String a(String string, boolean bl2) {
        char c2 = bl2 ? (char)'/' : '\\';
        return p.a(string, c2, true);
    }

    public static String b(String string) {
        return p.a(string, e, false);
    }

    public static String b(String string, boolean bl2) {
        char c2 = bl2 ? (char)'/' : '\\';
        return p.a(string, c2, false);
    }

    private static String a(String string, char c2, boolean bl2) {
        int n2;
        int n3;
        if (string == null) {
            return null;
        }
        int n4 = string.length();
        if (n4 == 0) {
            return string;
        }
        int n5 = p.f(string);
        if (n5 < 0) {
            return null;
        }
        char[] arrc = new char[n4 + 2];
        string.getChars(0, string.length(), arrc, 0);
        char c3 = c2 == e ? f : e;
        for (n3 = 0; n3 < arrc.length; ++n3) {
            if (arrc[n3] != c3) continue;
            arrc[n3] = c2;
        }
        n3 = 1;
        if (arrc[n4 - 1] != c2) {
            arrc[n4++] = c2;
            n3 = 0;
        }
        for (n2 = n5 + 1; n2 < n4; ++n2) {
            if (arrc[n2] != c2 || arrc[n2 - 1] != c2) continue;
            System.arraycopy(arrc, n2, arrc, n2 - 1, n4 - n2);
            --n4;
            --n2;
        }
        for (n2 = n5 + 1; n2 < n4; ++n2) {
            if (arrc[n2] != c2 || arrc[n2 - 1] != '.' || n2 != n5 + 1 && arrc[n2 - 2] != c2) continue;
            if (n2 == n4 - 1) {
                n3 = 1;
            }
            System.arraycopy(arrc, n2 + 1, arrc, n2 - 1, n4 - n2);
            n4 -= 2;
            --n2;
        }
        block3: for (n2 = n5 + 2; n2 < n4; ++n2) {
            if (arrc[n2] != c2 || arrc[n2 - 1] != '.' || arrc[n2 - 2] != '.' || n2 != n5 + 2 && arrc[n2 - 3] != c2) continue;
            if (n2 == n5 + 2) {
                return null;
            }
            if (n2 == n4 - 1) {
                n3 = 1;
            }
            for (int i2 = n2 - 4; i2 >= n5; --i2) {
                if (arrc[i2] != c2) continue;
                System.arraycopy(arrc, n2 + 1, arrc, i2 + 1, n4 - n2);
                n4 -= n2 - i2;
                n2 = i2 + 1;
                continue block3;
            }
            System.arraycopy(arrc, n2 + 1, arrc, n5, n4 - n2);
            n4 -= n2 + 1 - n5;
            n2 = n5 + 1;
        }
        if (n4 <= 0) {
            return "";
        }
        if (n4 <= n5) {
            return new String(arrc, 0, n4);
        }
        if (n3 != 0 && bl2) {
            return new String(arrc, 0, n4);
        }
        return new String(arrc, 0, n4 - 1);
    }

    public static String a(String string, String string2) {
        int n2 = p.f(string2);
        if (n2 < 0) {
            return null;
        }
        if (n2 > 0) {
            return p.a(string2);
        }
        if (string == null) {
            return null;
        }
        int n3 = string.length();
        if (n3 == 0) {
            return p.a(string2);
        }
        char c2 = string.charAt(n3 - 1);
        if (p.a(c2)) {
            return p.a(string + string2);
        }
        return p.a(string + '/' + string2);
    }

    public static boolean b(String string, String string2) {
        if (string == null) {
            throw new IllegalArgumentException("Directory must not be null");
        }
        if (string2 == null) {
            return false;
        }
        if (r.c.b(string, string2)) {
            return false;
        }
        return r.c.c(string2, string);
    }

    public static String c(String string) {
        if (string == null || string.indexOf(92) == -1) {
            return string;
        }
        return string.replace('\\', '/');
    }

    public static String d(String string) {
        if (string == null || string.indexOf(47) == -1) {
            return string;
        }
        return string.replace('/', '\\');
    }

    public static String e(String string) {
        if (string == null) {
            return null;
        }
        if (p.a()) {
            return p.d(string);
        }
        return p.c(string);
    }

    public static int f(String string) {
        if (string == null) {
            return -1;
        }
        int n2 = string.length();
        if (n2 == 0) {
            return 0;
        }
        char c2 = string.charAt(0);
        if (c2 == ':') {
            return -1;
        }
        if (n2 == 1) {
            if (c2 == '~') {
                return 2;
            }
            return p.a(c2) ? 1 : 0;
        }
        if (c2 == '~') {
            int n3 = string.indexOf(47, 1);
            int n4 = string.indexOf(92, 1);
            if (n3 == -1 && n4 == -1) {
                return n2 + 1;
            }
            n3 = n3 == -1 ? n4 : n3;
            n4 = n4 == -1 ? n3 : n4;
            return Math.min(n3, n4) + 1;
        }
        char c3 = string.charAt(1);
        if (c3 == ':') {
            if ((c2 = Character.toUpperCase(c2)) >= 'A' && c2 <= 'Z') {
                if (n2 == 2 || !p.a(string.charAt(2))) {
                    return 2;
                }
                return 3;
            }
            return -1;
        }
        if (p.a(c2) && p.a(c3)) {
            int n5 = string.indexOf(47, 2);
            int n6 = string.indexOf(92, 2);
            if (n5 == -1 && n6 == -1 || n5 == 2 || n6 == 2) {
                return -1;
            }
            n5 = n5 == -1 ? n6 : n5;
            n6 = n6 == -1 ? n5 : n6;
            return Math.min(n5, n6) + 1;
        }
        return p.a(c2) ? 1 : 0;
    }

    public static int g(String string) {
        if (string == null) {
            return -1;
        }
        int n2 = string.lastIndexOf(47);
        int n3 = string.lastIndexOf(92);
        return Math.max(n2, n3);
    }

    public static int h(String string) {
        if (string == null) {
            return -1;
        }
        int n2 = string.lastIndexOf(46);
        int n3 = p.g(string);
        return n3 > n2 ? -1 : n2;
    }

    public static String i(String string) {
        if (string == null) {
            return null;
        }
        int n2 = p.f(string);
        if (n2 < 0) {
            return null;
        }
        if (n2 > string.length()) {
            return string + '/';
        }
        return string.substring(0, n2);
    }

    public static String j(String string) {
        return p.a(string, 1);
    }

    public static String k(String string) {
        return p.a(string, 0);
    }

    private static String a(String string, int n2) {
        if (string == null) {
            return null;
        }
        int n3 = p.f(string);
        if (n3 < 0) {
            return null;
        }
        int n4 = p.g(string);
        int n5 = n4 + n2;
        if (n3 >= string.length() || n4 < 0 || n3 >= n5) {
            return "";
        }
        return string.substring(n3, n5);
    }

    public static String l(String string) {
        return p.c(string, true);
    }

    public static String m(String string) {
        return p.c(string, false);
    }

    private static String c(String string, boolean bl2) {
        if (string == null) {
            return null;
        }
        int n2 = p.f(string);
        if (n2 < 0) {
            return null;
        }
        if (n2 >= string.length()) {
            if (bl2) {
                return p.i(string);
            }
            return string;
        }
        int n3 = p.g(string);
        if (n3 < 0) {
            return string.substring(0, n2);
        }
        int n4 = n3 + (bl2 ? 1 : 0);
        if (n4 == 0) {
            ++n4;
        }
        return string.substring(0, n4);
    }

    public static String n(String string) {
        if (string == null) {
            return null;
        }
        int n2 = p.g(string);
        return string.substring(n2 + 1);
    }

    public static String o(String string) {
        return p.q(p.n(string));
    }

    public static String p(String string) {
        if (string == null) {
            return null;
        }
        int n2 = p.h(string);
        if (n2 == -1) {
            return "";
        }
        return string.substring(n2 + 1);
    }

    public static String q(String string) {
        if (string == null) {
            return null;
        }
        int n2 = p.h(string);
        if (n2 == -1) {
            return string;
        }
        return string.substring(0, n2);
    }

    public static boolean c(String string, String string2) {
        return p.a(string, string2, false, r.a);
    }

    public static boolean d(String string, String string2) {
        return p.a(string, string2, false, r.c);
    }

    public static boolean e(String string, String string2) {
        return p.a(string, string2, true, r.a);
    }

    public static boolean f(String string, String string2) {
        return p.a(string, string2, true, r.c);
    }

    public static boolean a(String string, String string2, boolean bl2, r r2) {
        if (string == null || string2 == null) {
            return string == null && string2 == null;
        }
        if (bl2) {
            string = p.a(string);
            string2 = p.a(string2);
            if (string == null || string2 == null) {
                throw new NullPointerException("Error normalizing one or both of the file names");
            }
        }
        if (r2 == null) {
            r2 = r.a;
        }
        return r2.b(string, string2);
    }

    public static boolean g(String string, String string2) {
        if (string == null) {
            return false;
        }
        if (string2 == null || string2.length() == 0) {
            return p.h(string) == -1;
        }
        String string3 = p.p(string);
        return string3.equals(string2);
    }

    public static boolean a(String string, String[] arrstring) {
        if (string == null) {
            return false;
        }
        if (arrstring == null || arrstring.length == 0) {
            return p.h(string) == -1;
        }
        String string2 = p.p(string);
        for (String string3 : arrstring) {
            if (!string2.equals(string3)) continue;
            return true;
        }
        return false;
    }

    public static boolean a(String string, Collection collection) {
        if (string == null) {
            return false;
        }
        if (collection == null || collection.isEmpty()) {
            return p.h(string) == -1;
        }
        String string2 = p.p(string);
        for (String string3 : collection) {
            if (!string2.equals(string3)) continue;
            return true;
        }
        return false;
    }

    public static boolean h(String string, String string2) {
        return p.a(string, string2, r.a);
    }

    public static boolean i(String string, String string2) {
        return p.a(string, string2, r.c);
    }

    public static boolean a(String string, String string2, r r2) {
        if (string == null && string2 == null) {
            return true;
        }
        if (string == null || string2 == null) {
            return false;
        }
        if (r2 == null) {
            r2 = r.a;
        }
        String[] arrstring = p.r(string2);
        boolean bl2 = false;
        int n2 = 0;
        int n3 = 0;
        Stack<int[]> stack = new Stack<int[]>();
        do {
            if (stack.size() > 0) {
                int[] arrn = (int[])stack.pop();
                n3 = arrn[0];
                n2 = arrn[1];
                bl2 = true;
            }
            while (n3 < arrstring.length) {
                if (arrstring[n3].equals("?")) {
                    if (++n2 > string.length()) break;
                    bl2 = false;
                } else if (arrstring[n3].equals("*")) {
                    bl2 = true;
                    if (n3 == arrstring.length - 1) {
                        n2 = string.length();
                    }
                } else {
                    if (bl2) {
                        if ((n2 = r2.a(string, n2, arrstring[n3])) == -1) break;
                        int n4 = r2.a(string, n2 + 1, arrstring[n3]);
                        if (n4 >= 0) {
                            stack.push(new int[]{n3, n4});
                        }
                    } else if (!r2.b(string, n2, arrstring[n3])) break;
                    n2 += arrstring[n3].length();
                    bl2 = false;
                }
                ++n3;
            }
            if (n3 != arrstring.length || n2 != string.length()) continue;
            return true;
        } while (stack.size() > 0);
        return false;
    }

    static String[] r(String string) {
        if (string.indexOf(63) == -1 && string.indexOf(42) == -1) {
            return new String[]{string};
        }
        char[] arrc = string.toCharArray();
        ArrayList<String> arrayList = new ArrayList<String>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < arrc.length; ++i2) {
            if (arrc[i2] == '?' || arrc[i2] == '*') {
                if (stringBuilder.length() != 0) {
                    arrayList.add(stringBuilder.toString());
                    stringBuilder.setLength(0);
                }
                if (arrc[i2] == '?') {
                    arrayList.add("?");
                    continue;
                }
                if (!arrayList.isEmpty() && (i2 <= 0 || ((String)arrayList.get(arrayList.size() - 1)).equals("*"))) continue;
                arrayList.add("*");
                continue;
            }
            stringBuilder.append(arrc[i2]);
        }
        if (stringBuilder.length() != 0) {
            arrayList.add(stringBuilder.toString());
        }
        return arrayList.toArray(new String[arrayList.size()]);
    }
}

