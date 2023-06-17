/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.c.a.d.ac;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class bu {
    private static final int a = 1024;
    private final Charset b;
    private final String c;
    private final boolean d;
    private final int e;
    private String f;
    private Map g;
    private int h;

    public bu(String string) {
        this(string, ac.j);
    }

    public bu(String string, boolean bl2) {
        this(string, ac.j, bl2);
    }

    public bu(String string, Charset charset) {
        this(string, charset, true);
    }

    public bu(String string, Charset charset, boolean bl2) {
        this(string, charset, bl2, 1024);
    }

    public bu(String string, Charset charset, boolean bl2, int n2) {
        if (string == null) {
            throw new NullPointerException("getUri");
        }
        if (charset == null) {
            throw new NullPointerException("charset");
        }
        if (n2 <= 0) {
            throw new IllegalArgumentException("maxParams: " + n2 + " (expected: a positive integer)");
        }
        this.c = string;
        this.b = charset;
        this.e = n2;
        this.d = bl2;
    }

    public bu(URI uRI) {
        this(uRI, ac.j);
    }

    public bu(URI uRI, Charset charset) {
        this(uRI, charset, 1024);
    }

    public bu(URI uRI, Charset charset, int n2) {
        if (uRI == null) {
            throw new NullPointerException("getUri");
        }
        if (charset == null) {
            throw new NullPointerException("charset");
        }
        if (n2 <= 0) {
            throw new IllegalArgumentException("maxParams: " + n2 + " (expected: a positive integer)");
        }
        String string = uRI.getRawPath();
        if (string != null) {
            this.d = true;
        } else {
            string = "";
            this.d = false;
        }
        this.c = string + '?' + uRI.getRawQuery();
        this.b = charset;
        this.e = n2;
    }

    public String a() {
        if (this.f == null) {
            if (!this.d) {
                this.f = "";
                return "";
            }
            int n2 = this.c.indexOf(63);
            if (n2 < 0) {
                this.f = this.c;
            } else {
                this.f = this.c.substring(0, n2);
                return this.f;
            }
        }
        return this.f;
    }

    public Map b() {
        if (this.g == null) {
            if (this.d) {
                int n2 = this.a().length();
                if (this.c.length() == n2) {
                    return Collections.emptyMap();
                }
                this.b(this.c.substring(n2 + 1));
            } else {
                if (this.c.isEmpty()) {
                    return Collections.emptyMap();
                }
                this.b(this.c);
            }
        }
        return this.g;
    }

    private void b(String string) {
        int n2;
        LinkedHashMap linkedHashMap = this.g = new LinkedHashMap();
        this.h = 0;
        String string2 = null;
        int n3 = 0;
        for (n2 = 0; n2 < string.length(); ++n2) {
            char c2 = string.charAt(n2);
            if (c2 == '=' && string2 == null) {
                if (n3 != n2) {
                    string2 = bu.a(string.substring(n3, n2), this.b);
                }
                n3 = n2 + 1;
                continue;
            }
            if (c2 != '&' && c2 != ';') continue;
            if (string2 == null && n3 != n2) {
                if (!this.a(linkedHashMap, bu.a(string.substring(n3, n2), this.b), "")) {
                    return;
                }
            } else if (string2 != null) {
                if (!this.a(linkedHashMap, string2, bu.a(string.substring(n3, n2), this.b))) {
                    return;
                }
                string2 = null;
            }
            n3 = n2 + 1;
        }
        if (n3 != n2) {
            if (string2 == null) {
                this.a(linkedHashMap, bu.a(string.substring(n3, n2), this.b), "");
            } else {
                this.a(linkedHashMap, string2, bu.a(string.substring(n3, n2), this.b));
            }
        } else if (string2 != null) {
            this.a(linkedHashMap, string2, "");
        }
    }

    private boolean a(Map map, String string, String string2) {
        if (this.h >= this.e) {
            return false;
        }
        ArrayList<String> arrayList = (ArrayList<String>)map.get(string);
        if (arrayList == null) {
            arrayList = new ArrayList<String>(1);
            map.put(string, arrayList);
        }
        arrayList.add(string2);
        ++this.h;
        return true;
    }

    public static String a(String string) {
        return bu.a(string, ac.j);
    }

    public static String a(String string, Charset charset) {
        int n2;
        if (string == null) {
            return "";
        }
        int n3 = string.length();
        boolean bl2 = false;
        for (int i2 = 0; i2 < n3; ++i2) {
            n2 = string.charAt(i2);
            if (n2 != 37 && n2 != 43) continue;
            bl2 = true;
            break;
        }
        if (!bl2) {
            return string;
        }
        byte[] arrby = new byte[n3];
        n2 = 0;
        block5: for (int i3 = 0; i3 < n3; ++i3) {
            char c2 = string.charAt(i3);
            switch (c2) {
                case '+': {
                    arrby[n2++] = 32;
                    continue block5;
                }
                case '%': {
                    if (i3 == n3 - 1) {
                        throw new IllegalArgumentException("unterminated escape sequence at end of string: " + string);
                    }
                    if ((c2 = string.charAt(++i3)) == '%') {
                        arrby[n2++] = 37;
                        continue block5;
                    }
                    if (i3 == n3 - 1) {
                        throw new IllegalArgumentException("partial escape sequence at end of string: " + string);
                    }
                    c2 = bu.a(c2);
                    char c3 = bu.a(string.charAt(++i3));
                    if (c2 == '\uffff' || c3 == '\uffff') {
                        throw new IllegalArgumentException("invalid escape sequence `%" + string.charAt(i3 - 1) + string.charAt(i3) + "' at index " + (i3 - 2) + " of: " + string);
                    }
                    c2 = (char)(c2 * 16 + c3);
                }
                default: {
                    arrby[n2++] = (byte)c2;
                }
            }
        }
        return new String(arrby, 0, n2, charset);
    }

    private static char a(char c2) {
        if ('0' <= c2 && c2 <= '9') {
            return (char)(c2 - 48);
        }
        if ('a' <= c2 && c2 <= 'f') {
            return (char)(c2 - 97 + 10);
        }
        if ('A' <= c2 && c2 <= 'F') {
            return (char)(c2 - 65 + 10);
        }
        return '\uffff';
    }
}

