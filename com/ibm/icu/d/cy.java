/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.aj;
import com.ibm.icu.a.ew;
import com.ibm.icu.a.r;
import com.ibm.icu.d.cu;
import com.ibm.icu.d.cz;
import com.ibm.icu.d.da;
import com.ibm.icu.d.db;
import com.ibm.icu.d.dc;
import com.ibm.icu.d.dd;
import com.ibm.icu.d.eo;
import com.ibm.icu.d.iz;
import com.ibm.icu.d.kv;
import com.ibm.icu.util.at;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dr;
import com.ibm.icu.util.n;
import java.io.ObjectInputStream;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class cy
extends kv {
    private static final long a = 1L;
    private static aj b = new ew();
    private db c;
    private iz d;
    private n e;
    private n f;
    private String g = null;
    private boolean h;
    private transient Map i = null;

    private cy() {
    }

    public cy(String string, db db2, iz iz2) {
        this.d = iz2;
        db2.c();
        this.g = string;
        this.c = db2;
        this.h = false;
        this.e = (n)this.d.g().clone();
        this.f = (n)this.d.g().clone();
        this.a((aj)null);
    }

    private cy(String string, dn dn2, iz iz2) {
        this.d = iz2;
        this.g = string;
        this.c = new db(dn2).c();
        this.h = true;
        this.e = (n)this.d.g().clone();
        this.f = (n)this.d.g().clone();
        this.a(b);
    }

    public static final cy a(String string) {
        return cy.a(string, dn.a(dr.b));
    }

    public static final cy a(String string, Locale locale) {
        return cy.a(string, dn.a(locale));
    }

    public static final cy a(String string, dn dn2) {
        dd dd2 = dd.a(dn2);
        return new cy(string, dn2, new iz(dd2.b(string), dn2));
    }

    public static final cy a(String string, db db2) {
        return cy.a(string, dn.a(dr.b), db2);
    }

    public static final cy a(String string, Locale locale, db db2) {
        return cy.a(string, dn.a(locale), db2);
    }

    public static final cy a(String string, dn dn2, db db2) {
        db2 = (db)db2.clone();
        dd dd2 = dd.a(dn2);
        return new cy(string, db2, new iz(dd2.b(string), dn2));
    }

    public Object clone() {
        cy cy2 = (cy)super.clone();
        cy2.d = (iz)this.d.clone();
        cy2.c = (db)this.c.clone();
        cy2.e = (n)this.e.clone();
        cy2.f = (n)this.f.clone();
        return cy2;
    }

    public final StringBuffer format(Object object, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        if (object instanceof at) {
            return this.a((at)object, stringBuffer, fieldPosition);
        }
        throw new IllegalArgumentException("Cannot format given Object (" + object.getClass().getName() + ") as a DateInterval");
    }

    public final StringBuffer a(at at2, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        this.e.a(at2.a());
        this.f.a(at2.b());
        return this.a(this.e, this.f, stringBuffer, fieldPosition);
    }

    public final StringBuffer a(n n2, n n3, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        n n4;
        n n5;
        if (!n2.a(n3)) {
            throw new IllegalArgumentException("can not format on two different calendars");
        }
        int n6 = -1;
        if (n2.b(0) != n3.b(0)) {
            n6 = 0;
        } else if (n2.b(1) != n3.b(1)) {
            n6 = 1;
        } else if (n2.b(2) != n3.b(2)) {
            n6 = 2;
        } else if (n2.b(5) != n3.b(5)) {
            n6 = 5;
        } else if (n2.b(9) != n3.b(9)) {
            n6 = 9;
        } else if (n2.b(10) != n3.b(10)) {
            n6 = 10;
        } else if (n2.b(12) != n3.b(12)) {
            n6 = 12;
        } else {
            return this.d.a(n2, stringBuffer, fieldPosition);
        }
        dc dc2 = (dc)this.i.get(db.b[n6]);
        if (dc2 == null) {
            if (this.d.c(n6)) {
                return this.d.a(n2, stringBuffer, fieldPosition);
            }
            return this.b(n2, n3, stringBuffer, fieldPosition);
        }
        if (dc2.a() == null) {
            return this.a(n2, n3, stringBuffer, fieldPosition, dc2.b());
        }
        if (dc2.c()) {
            n5 = n3;
            n4 = n2;
        } else {
            n5 = n2;
            n4 = n3;
        }
        String string = this.d.l();
        this.d.c(dc2.a());
        this.d.a(n5, stringBuffer, fieldPosition);
        if (dc2.b() != null) {
            this.d.c(dc2.b());
            this.d.a(n4, stringBuffer, fieldPosition);
        }
        this.d.c(string);
        return stringBuffer;
    }

    private final StringBuffer b(n n2, n n3, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        StringBuffer stringBuffer2 = new StringBuffer(64);
        stringBuffer2 = this.d.a(n2, stringBuffer2, fieldPosition);
        StringBuffer stringBuffer3 = new StringBuffer(64);
        stringBuffer3 = this.d.a(n3, stringBuffer3, fieldPosition);
        String string = this.c.a();
        String string2 = eo.a(string, stringBuffer2.toString(), stringBuffer3.toString());
        stringBuffer.append(string2);
        return stringBuffer;
    }

    private final StringBuffer a(n n2, n n3, StringBuffer stringBuffer, FieldPosition fieldPosition, String string) {
        String string2 = this.d.l();
        this.d.c(string);
        this.b(n2, n3, stringBuffer, fieldPosition);
        this.d.c(string2);
        return stringBuffer;
    }

    public Object parseObject(String string, ParsePosition parsePosition) {
        throw new UnsupportedOperationException("parsing is not supported");
    }

    public db a() {
        return (db)this.c.clone();
    }

    public void a(db db2) {
        this.c = (db)db2.clone();
        this.h = false;
        this.c.c();
        if (this.d != null) {
            this.a((aj)null);
        }
    }

    public cu b() {
        return (cu)this.d.clone();
    }

    private void a(aj aj2) {
        String string = this.d.l();
        dn dn2 = this.d.q();
        String string2 = null;
        Map map = null;
        if (aj2 != null) {
            string2 = this.g != null ? dn2.toString() + "+" + string + "+" + this.g : dn2.toString() + "+" + string;
            map = (Map)aj2.a(string2);
        }
        if (map == null) {
            Map map2 = this.b(string, dn2);
            map = Collections.unmodifiableMap(map2);
            if (aj2 != null) {
                aj2.a(string2, map);
            }
        }
        this.i = map;
    }

    private Map b(String string, dn dn2) {
        dd dd2 = dd.a(dn2);
        if (this.g == null) {
            this.g = dd2.c(string);
        }
        String string2 = this.g;
        HashMap<String, dc> hashMap = new HashMap<String, dc>();
        StringBuilder stringBuilder = new StringBuilder(string2.length());
        StringBuilder stringBuilder2 = new StringBuilder(string2.length());
        StringBuilder stringBuilder3 = new StringBuilder(string2.length());
        StringBuilder stringBuilder4 = new StringBuilder(string2.length());
        cy.a(string2, stringBuilder, stringBuilder2, stringBuilder3, stringBuilder4);
        String string3 = stringBuilder.toString();
        String string4 = stringBuilder3.toString();
        String string5 = stringBuilder2.toString();
        String string6 = stringBuilder4.toString();
        boolean bl2 = this.a(string5, string6, hashMap);
        if (!bl2) {
            if (stringBuilder3.length() != 0 && stringBuilder.length() == 0) {
                string4 = "yMd" + string4;
                String string7 = dd2.b(string4);
                dc dc2 = new dc(null, string7, this.c.b());
                hashMap.put(db.b[5], dc2);
                hashMap.put(db.b[2], dc2);
                hashMap.put(db.b[1], dc2);
            }
            return hashMap;
        }
        if (stringBuilder3.length() != 0) {
            if (stringBuilder.length() == 0) {
                string4 = "yMd" + string4;
                String string8 = dd2.b(string4);
                dc dc3 = new dc(null, string8, this.c.b());
                hashMap.put(db.b[5], dc3);
                hashMap.put(db.b[2], dc3);
                hashMap.put(db.b[1], dc3);
            } else {
                if (!cy.a(5, string3)) {
                    string2 = db.b[5] + string2;
                    this.a(5, string2, hashMap, dd2);
                }
                if (!cy.a(2, string3)) {
                    string2 = db.b[2] + string2;
                    this.a(2, string2, hashMap, dd2);
                }
                if (!cy.a(1, string3)) {
                    string2 = db.b[1] + string2;
                    this.a(1, string2, hashMap, dd2);
                }
                r r2 = new r(dn2, null);
                String[] arrstring = r2.a();
                String string9 = dd2.b(string3);
                this.a(arrstring[8], string9, 9, hashMap);
                this.a(arrstring[8], string9, 10, hashMap);
                this.a(arrstring[8], string9, 12, hashMap);
            }
        }
        return hashMap;
    }

    private void a(int n2, String string, Map map, dd dd2) {
        String string2 = dd2.b(string);
        dc dc2 = new dc(null, string2, this.c.b());
        map.put(db.b[n2], dc2);
    }

    private static void a(String string, StringBuilder stringBuilder, StringBuilder stringBuilder2, StringBuilder stringBuilder3, StringBuilder stringBuilder4) {
        int n2;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        block14: for (n2 = 0; n2 < string.length(); ++n2) {
            char c2 = string.charAt(n2);
            switch (c2) {
                case 'E': {
                    stringBuilder.append(c2);
                    ++n3;
                    continue block14;
                }
                case 'd': {
                    stringBuilder.append(c2);
                    ++n4;
                    continue block14;
                }
                case 'M': {
                    stringBuilder.append(c2);
                    ++n5;
                    continue block14;
                }
                case 'y': {
                    stringBuilder.append(c2);
                    ++n6;
                    continue block14;
                }
                case 'D': 
                case 'F': 
                case 'G': 
                case 'L': 
                case 'Q': 
                case 'W': 
                case 'Y': 
                case 'c': 
                case 'e': 
                case 'g': 
                case 'l': 
                case 'q': 
                case 'u': 
                case 'w': {
                    stringBuilder2.append(c2);
                    stringBuilder.append(c2);
                    continue block14;
                }
                case 'a': {
                    stringBuilder3.append(c2);
                    continue block14;
                }
                case 'h': {
                    stringBuilder3.append(c2);
                    ++n7;
                    continue block14;
                }
                case 'H': {
                    stringBuilder3.append(c2);
                    ++n8;
                    continue block14;
                }
                case 'm': {
                    stringBuilder3.append(c2);
                    ++n9;
                    continue block14;
                }
                case 'z': {
                    ++n11;
                    stringBuilder3.append(c2);
                    continue block14;
                }
                case 'v': {
                    ++n10;
                    stringBuilder3.append(c2);
                    continue block14;
                }
                case 'A': 
                case 'K': 
                case 'S': 
                case 'V': 
                case 'Z': 
                case 'j': 
                case 'k': 
                case 's': {
                    stringBuilder3.append(c2);
                    stringBuilder4.append(c2);
                }
            }
        }
        if (n6 != 0) {
            stringBuilder2.append('y');
        }
        if (n5 != 0) {
            if (n5 < 3) {
                stringBuilder2.append('M');
            } else {
                for (n2 = 0; n2 < n5 && n2 < 5; ++n2) {
                    stringBuilder2.append('M');
                }
            }
        }
        if (n3 != 0) {
            if (n3 <= 3) {
                stringBuilder2.append('E');
            } else {
                for (n2 = 0; n2 < n3 && n2 < 5; ++n2) {
                    stringBuilder2.append('E');
                }
            }
        }
        if (n4 != 0) {
            stringBuilder2.append('d');
        }
        if (n8 != 0) {
            stringBuilder4.append('H');
        } else if (n7 != 0) {
            stringBuilder4.append('h');
        }
        if (n9 != 0) {
            stringBuilder4.append('m');
        }
        if (n11 != 0) {
            stringBuilder4.append('z');
        }
        if (n10 != 0) {
            stringBuilder4.append('v');
        }
    }

    private boolean a(String string, String string2, Map map) {
        String string3 = string2.length() != 0 ? string2 : string;
        cz cz2 = this.c.b(string3);
        String string4 = cz2.a;
        int n2 = cz2.b;
        if (n2 == -1) {
            return false;
        }
        if (string2.length() == 0) {
            this.a(5, string3, string4, n2, map);
            da da2 = this.a(2, string3, string4, n2, map);
            if (da2 != null) {
                string4 = da2.a;
                string3 = da2.b;
            }
            this.a(1, string3, string4, n2, map);
        } else {
            this.a(12, string3, string4, n2, map);
            this.a(10, string3, string4, n2, map);
            this.a(9, string3, string4, n2, map);
        }
        return true;
    }

    private da a(int n2, String string, String string2, int n3, Map map) {
        Object object;
        String string3;
        da da2 = null;
        dc dc2 = this.c.a(string2, n2);
        if (dc2 == null) {
            if (iz.a(string2, n2)) {
                dc dc3 = new dc(this.d.l(), null, this.c.b());
                map.put(db.b[n2], dc3);
                return null;
            }
            if (n2 == 9) {
                dc2 = this.c.a(string2, 10);
                if (dc2 != null) {
                    map.put(db.b[n2], dc2);
                }
                return null;
            }
            string3 = db.b[n2];
            string2 = string3 + string2;
            string = string3 + string;
            dc2 = this.c.a(string2, n2);
            if (dc2 == null && n3 == 0) {
                object = this.c.b(string);
                String string4 = ((cz)object).a;
                n3 = ((cz)object).b;
                if (string4.length() != 0 && n3 != -1) {
                    dc2 = this.c.a(string4, n2);
                    string2 = string4;
                }
            }
            if (dc2 != null) {
                da2 = new da(string, string2);
            }
        }
        if (dc2 != null) {
            if (n3 != 0) {
                string3 = cy.a(string, string2, dc2.a(), n3);
                object = cy.a(string, string2, dc2.b(), n3);
                dc2 = new dc(string3, (String)object, dc2.c());
            }
            map.put(db.b[n2], dc2);
        }
        return da2;
    }

    private static String a(String string, String string2, String string3, int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        if (string3 == null) {
            return null;
        }
        int[] arrn = new int[58];
        int[] arrn2 = new int[58];
        db.a(string, arrn);
        db.a(string2, arrn2);
        if (n2 == 2) {
            string3 = string3.replace('v', 'z');
        }
        StringBuilder stringBuilder = new StringBuilder(string3);
        boolean bl2 = false;
        int n7 = 0;
        int n8 = 0;
        int n9 = 65;
        int n10 = stringBuilder.length();
        for (n6 = 0; n6 < n10; ++n6) {
            n5 = stringBuilder.charAt(n6);
            if (n5 != n7 && n8 > 0) {
                n4 = n7;
                if (n4 == 76) {
                    n4 = 77;
                }
                n3 = arrn2[n4 - n9];
                int n11 = arrn[n4 - n9];
                if (n3 == n8 && n11 > n3) {
                    n8 = n11 - n3;
                    for (int i2 = 0; i2 < n8; ++i2) {
                        stringBuilder.insert(n6, (char)n7);
                    }
                    n6 += n8;
                    n10 += n8;
                }
                n8 = 0;
            }
            if (n5 == 39) {
                if (n6 + 1 < stringBuilder.length() && stringBuilder.charAt(n6 + 1) == '\'') {
                    ++n6;
                    continue;
                }
                bl2 = !bl2;
                continue;
            }
            if (bl2 || (n5 < 97 || n5 > 122) && (n5 < 65 || n5 > 90)) continue;
            n7 = n5;
            ++n8;
        }
        if (n8 > 0) {
            n6 = n7;
            if (n6 == 76) {
                n6 = 77;
            }
            n5 = arrn2[n6 - n9];
            n4 = arrn[n6 - n9];
            if (n5 == n8 && n4 > n5) {
                n8 = n4 - n5;
                for (n3 = 0; n3 < n8; ++n3) {
                    stringBuilder.append((char)n7);
                }
            }
        }
        return stringBuilder.toString();
    }

    private void a(String string, String string2, int n2, Map map) {
        dc dc2 = (dc)map.get(db.b[n2]);
        if (dc2 != null) {
            String string3 = dc2.a() + dc2.b();
            String string4 = eo.a(string, string3, string2);
            dc2 = db.a(string4, dc2.c());
            map.put(db.b[n2], dc2);
        }
    }

    private static boolean a(int n2, String string) {
        String string2 = db.b[n2];
        return string.indexOf(string2) != -1;
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.a(this.h ? b : null);
    }
}

