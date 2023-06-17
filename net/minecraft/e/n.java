/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.e;

import java.util.Stack;
import java.util.regex.Pattern;
import net.minecraft.e.e;
import net.minecraft.e.i;
import net.minecraft.e.p;
import net.minecraft.e.v;
import net.minecraft.e.x;
import net.minecraft.e.z;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class n {
    private static final d a = c.c();
    private static final Pattern b = Pattern.compile("\\[[-+\\d|,\\s]+\\]");

    public static e a(String string) {
        if (!(string = string.trim()).startsWith("{")) {
            throw new i("Invalid tag encountered, expected '{' as first char.");
        }
        if (n.b(string) != 1) {
            throw new i("Encountered multiple top tags, only one expected");
        }
        return (e)n.a("tag", string).a();
    }

    static int b(String string) {
        int n2 = 0;
        boolean bl2 = false;
        Stack<Character> stack = new Stack<Character>();
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (c2 == '\"') {
                if (n.b(string, i2)) {
                    if (bl2) continue;
                    throw new i("Illegal use of \\\": " + string);
                }
                bl2 = !bl2;
                continue;
            }
            if (bl2) continue;
            if (c2 != '{' && c2 != '[') {
                if (c2 == '}' && (stack.isEmpty() || ((Character)stack.pop()).charValue() != '{')) {
                    throw new i("Unbalanced curly brackets {}: " + string);
                }
                if (c2 != ']' || !stack.isEmpty() && ((Character)stack.pop()).charValue() == '[') continue;
                throw new i("Unbalanced square brackets []: " + string);
            }
            if (stack.isEmpty()) {
                ++n2;
            }
            stack.push(Character.valueOf(c2));
        }
        if (bl2) {
            throw new i("Unbalanced quotation: " + string);
        }
        if (!stack.isEmpty()) {
            throw new i("Unbalanced brackets: " + string);
        }
        if (n2 == 0 && !string.isEmpty()) {
            n2 = 1;
        }
        return n2;
    }

    static x a(String ... arrstring) {
        return n.a(arrstring[0], arrstring[1]);
    }

    static x a(String string, String string2) {
        if ((string2 = string2.trim()).startsWith("{")) {
            string2 = string2.substring(1, string2.length() - 1);
            v v2 = new v(string);
            while (string2.length() > 0) {
                char c2;
                String string3 = n.b(string2, true);
                if (string3.length() > 0) {
                    c2 = '\u0000';
                    v2.a.add(n.a(string3, false));
                }
                if (string2.length() < string3.length() + 1) break;
                c2 = string2.charAt(string3.length());
                if (c2 != ',' && c2 != '{' && c2 != '}' && c2 != '[' && c2 != ']') {
                    throw new i("Unexpected token '" + c2 + "' at: " + string2.substring(string3.length()));
                }
                string2 = string2.substring(string3.length() + 1);
            }
            return v2;
        }
        if (string2.startsWith("[") && !b.matcher(string2).matches()) {
            string2 = string2.substring(1, string2.length() - 1);
            p p2 = new p(string);
            while (string2.length() > 0) {
                char c3;
                String string4 = n.b(string2, false);
                if (string4.length() > 0) {
                    c3 = '\u0001';
                    p2.a.add(n.a(string4, true));
                }
                if (string2.length() < string4.length() + 1) break;
                c3 = string2.charAt(string4.length());
                if (c3 != ',' && c3 != '{' && c3 != '}' && c3 != '[' && c3 != ']') {
                    throw new i("Unexpected token '" + c3 + "' at: " + string2.substring(string4.length()));
                }
                string2 = string2.substring(string4.length() + 1);
            }
            return p2;
        }
        return new z(string, string2);
    }

    private static x a(String string, boolean bl2) {
        String string2 = n.c(string, bl2);
        String string3 = n.d(string, bl2);
        return n.a(new String[]{string2, string3});
    }

    private static String b(String string, boolean bl2) {
        int n2 = n.a(string, ':');
        int n3 = n.a(string, ',');
        if (bl2) {
            if (n2 == -1) {
                throw new i("Unable to locate name/value separator for string: " + string);
            }
            if (n3 != -1 && n3 < n2) {
                throw new i("Name error at: " + string);
            }
        } else if (n2 == -1 || n2 > n3) {
            n2 = -1;
        }
        return n.a(string, n2);
    }

    private static String a(String string, int n2) {
        int n3;
        Stack<Character> stack = new Stack<Character>();
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        int n4 = 0;
        for (n3 = n2 + 1; n3 < string.length(); ++n3) {
            char c2 = string.charAt(n3);
            if (c2 == '\"') {
                if (n.b(string, n3)) {
                    if (!bl2) {
                        throw new i("Illegal use of \\\": " + string);
                    }
                } else {
                    boolean bl5 = bl2 = !bl2;
                    if (bl2 && !bl4) {
                        bl3 = true;
                    }
                    if (!bl2) {
                        n4 = n3;
                    }
                }
            } else if (!bl2) {
                if (c2 != '{' && c2 != '[') {
                    if (c2 == '}' && (stack.isEmpty() || ((Character)stack.pop()).charValue() != '{')) {
                        throw new i("Unbalanced curly brackets {}: " + string);
                    }
                    if (c2 == ']' && (stack.isEmpty() || ((Character)stack.pop()).charValue() != '[')) {
                        throw new i("Unbalanced square brackets []: " + string);
                    }
                    if (c2 == ',' && stack.isEmpty()) {
                        return string.substring(0, n3);
                    }
                } else {
                    stack.push(Character.valueOf(c2));
                }
            }
            if (Character.isWhitespace(c2)) continue;
            if (!bl2 && bl3 && n4 != n3) {
                return string.substring(0, n4 + 1);
            }
            bl4 = true;
        }
        return string.substring(0, n3);
    }

    private static String c(String string, boolean bl2) {
        if (bl2 && ((string = string.trim()).startsWith("{") || string.startsWith("["))) {
            return "";
        }
        int n2 = n.a(string, ':');
        if (n2 == -1) {
            if (bl2) {
                return "";
            }
            throw new i("Unable to locate name/value separator for string: " + string);
        }
        return string.substring(0, n2).trim();
    }

    private static String d(String string, boolean bl2) {
        if (bl2 && ((string = string.trim()).startsWith("{") || string.startsWith("["))) {
            return string;
        }
        int n2 = n.a(string, ':');
        if (n2 == -1) {
            if (bl2) {
                return string;
            }
            throw new i("Unable to locate name/value separator for string: " + string);
        }
        return string.substring(n2 + 1).trim();
    }

    private static int a(String string, char c2) {
        boolean bl2 = true;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c3 = string.charAt(i2);
            if (c3 == '\"') {
                if (n.b(string, i2)) continue;
                bl2 = !bl2;
                continue;
            }
            if (!bl2) continue;
            if (c3 == c2) {
                return i2;
            }
            if (c3 != '{' && c3 != '[') continue;
            return -1;
        }
        return -1;
    }

    private static boolean b(String string, int n2) {
        return n2 > 0 && string.charAt(n2 - 1) == '\\' && !n.b(string, n2 - 1);
    }
}

