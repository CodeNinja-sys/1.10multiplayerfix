/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.c;

import java.util.Locale;
import org.apache.commons.a.h;
import org.apache.commons.a.j;

public class l
implements j {
    private static final String a = "AEIOU";
    private static final String b = "EIY";
    private static final String c = "CSPTG";
    private int d = 4;

    public String a(String string) {
        boolean bl2 = false;
        if (string == null || string.length() == 0) {
            return "";
        }
        if (string.length() == 1) {
            return string.toUpperCase(Locale.ENGLISH);
        }
        char[] arrc = string.toUpperCase(Locale.ENGLISH).toCharArray();
        StringBuilder stringBuilder = new StringBuilder(40);
        StringBuilder stringBuilder2 = new StringBuilder(10);
        switch (arrc[0]) {
            case 'G': 
            case 'K': 
            case 'P': {
                if (arrc[1] == 'N') {
                    stringBuilder.append(arrc, 1, arrc.length - 1);
                    break;
                }
                stringBuilder.append(arrc);
                break;
            }
            case 'A': {
                if (arrc[1] == 'E') {
                    stringBuilder.append(arrc, 1, arrc.length - 1);
                    break;
                }
                stringBuilder.append(arrc);
                break;
            }
            case 'W': {
                if (arrc[1] == 'R') {
                    stringBuilder.append(arrc, 1, arrc.length - 1);
                    break;
                }
                if (arrc[1] == 'H') {
                    stringBuilder.append(arrc, 1, arrc.length - 1);
                    stringBuilder.setCharAt(0, 'W');
                    break;
                }
                stringBuilder.append(arrc);
                break;
            }
            case 'X': {
                arrc[0] = 83;
                stringBuilder.append(arrc);
                break;
            }
            default: {
                stringBuilder.append(arrc);
            }
        }
        int n2 = stringBuilder.length();
        int n3 = 0;
        while (stringBuilder2.length() < this.a() && n3 < n2) {
            char c2 = stringBuilder.charAt(n3);
            if (c2 != 'C' && this.a(stringBuilder, n3, c2)) {
                ++n3;
            } else {
                switch (c2) {
                    case 'A': 
                    case 'E': 
                    case 'I': 
                    case 'O': 
                    case 'U': {
                        if (n3 != 0) break;
                        stringBuilder2.append(c2);
                        break;
                    }
                    case 'B': {
                        if (this.a(stringBuilder, n3, 'M') && this.a(n2, n3)) break;
                        stringBuilder2.append(c2);
                        break;
                    }
                    case 'C': {
                        if (this.a(stringBuilder, n3, 'S') && !this.a(n2, n3) && b.indexOf(stringBuilder.charAt(n3 + 1)) >= 0) break;
                        if (this.a(stringBuilder, n3, "CIA")) {
                            stringBuilder2.append('X');
                            break;
                        }
                        if (!this.a(n2, n3) && b.indexOf(stringBuilder.charAt(n3 + 1)) >= 0) {
                            stringBuilder2.append('S');
                            break;
                        }
                        if (this.a(stringBuilder, n3, 'S') && this.b(stringBuilder, n3, 'H')) {
                            stringBuilder2.append('K');
                            break;
                        }
                        if (this.b(stringBuilder, n3, 'H')) {
                            if (n3 == 0 && n2 >= 3 && this.a(stringBuilder, 2)) {
                                stringBuilder2.append('K');
                                break;
                            }
                            stringBuilder2.append('X');
                            break;
                        }
                        stringBuilder2.append('K');
                        break;
                    }
                    case 'D': {
                        if (!this.a(n2, n3 + 1) && this.b(stringBuilder, n3, 'G') && b.indexOf(stringBuilder.charAt(n3 + 2)) >= 0) {
                            stringBuilder2.append('J');
                            n3 += 2;
                            break;
                        }
                        stringBuilder2.append('T');
                        break;
                    }
                    case 'G': {
                        if (this.a(n2, n3 + 1) && this.b(stringBuilder, n3, 'H') || !this.a(n2, n3 + 1) && this.b(stringBuilder, n3, 'H') && !this.a(stringBuilder, n3 + 2) || n3 > 0 && (this.a(stringBuilder, n3, "GN") || this.a(stringBuilder, n3, "GNED"))) break;
                        bl2 = this.a(stringBuilder, n3, 'G');
                        if (!this.a(n2, n3) && b.indexOf(stringBuilder.charAt(n3 + 1)) >= 0 && !bl2) {
                            stringBuilder2.append('J');
                            break;
                        }
                        stringBuilder2.append('K');
                        break;
                    }
                    case 'H': {
                        if (this.a(n2, n3) || n3 > 0 && c.indexOf(stringBuilder.charAt(n3 - 1)) >= 0 || !this.a(stringBuilder, n3 + 1)) break;
                        stringBuilder2.append('H');
                        break;
                    }
                    case 'F': 
                    case 'J': 
                    case 'L': 
                    case 'M': 
                    case 'N': 
                    case 'R': {
                        stringBuilder2.append(c2);
                        break;
                    }
                    case 'K': {
                        if (n3 > 0) {
                            if (this.a(stringBuilder, n3, 'C')) break;
                            stringBuilder2.append(c2);
                            break;
                        }
                        stringBuilder2.append(c2);
                        break;
                    }
                    case 'P': {
                        if (this.b(stringBuilder, n3, 'H')) {
                            stringBuilder2.append('F');
                            break;
                        }
                        stringBuilder2.append(c2);
                        break;
                    }
                    case 'Q': {
                        stringBuilder2.append('K');
                        break;
                    }
                    case 'S': {
                        if (this.a(stringBuilder, n3, "SH") || this.a(stringBuilder, n3, "SIO") || this.a(stringBuilder, n3, "SIA")) {
                            stringBuilder2.append('X');
                            break;
                        }
                        stringBuilder2.append('S');
                        break;
                    }
                    case 'T': {
                        if (this.a(stringBuilder, n3, "TIA") || this.a(stringBuilder, n3, "TIO")) {
                            stringBuilder2.append('X');
                            break;
                        }
                        if (this.a(stringBuilder, n3, "TCH")) break;
                        if (this.a(stringBuilder, n3, "TH")) {
                            stringBuilder2.append('0');
                            break;
                        }
                        stringBuilder2.append('T');
                        break;
                    }
                    case 'V': {
                        stringBuilder2.append('F');
                        break;
                    }
                    case 'W': 
                    case 'Y': {
                        if (this.a(n2, n3) || !this.a(stringBuilder, n3 + 1)) break;
                        stringBuilder2.append(c2);
                        break;
                    }
                    case 'X': {
                        stringBuilder2.append('K');
                        stringBuilder2.append('S');
                        break;
                    }
                    case 'Z': {
                        stringBuilder2.append('S');
                        break;
                    }
                }
                ++n3;
            }
            if (stringBuilder2.length() <= this.a()) continue;
            stringBuilder2.setLength(this.a());
        }
        return stringBuilder2.toString();
    }

    private boolean a(StringBuilder stringBuilder, int n2) {
        return a.indexOf(stringBuilder.charAt(n2)) >= 0;
    }

    private boolean a(StringBuilder stringBuilder, int n2, char c2) {
        boolean bl2 = false;
        if (n2 > 0 && n2 < stringBuilder.length()) {
            bl2 = stringBuilder.charAt(n2 - 1) == c2;
        }
        return bl2;
    }

    private boolean b(StringBuilder stringBuilder, int n2, char c2) {
        boolean bl2 = false;
        if (n2 >= 0 && n2 < stringBuilder.length() - 1) {
            bl2 = stringBuilder.charAt(n2 + 1) == c2;
        }
        return bl2;
    }

    private boolean a(StringBuilder stringBuilder, int n2, String string) {
        boolean bl2 = false;
        if (n2 >= 0 && n2 + string.length() - 1 < stringBuilder.length()) {
            String string2 = stringBuilder.substring(n2, n2 + string.length());
            bl2 = string2.equals(string);
        }
        return bl2;
    }

    private boolean a(int n2, int n3) {
        return n3 + 1 == n2;
    }

    @Override
    public Object b(Object object) {
        if (!(object instanceof String)) {
            throw new h("Parameter supplied to Metaphone encode is not of type java.lang.String");
        }
        return this.a((String)object);
    }

    @Override
    public String b(String string) {
        return this.a(string);
    }

    public boolean a(String string, String string2) {
        return this.a(string).equals(this.a(string2));
    }

    public int a() {
        return this.d;
    }

    public void a(int n2) {
        this.d = n2;
    }
}

