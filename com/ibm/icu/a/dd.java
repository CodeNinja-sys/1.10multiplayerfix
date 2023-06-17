/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.c.a;
import com.ibm.icu.a.de;
import com.ibm.icu.a.df;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public final class dd {
    private char[] c;
    private int d;
    private StringBuilder e;
    private boolean f;
    private boolean g;
    Map a;
    String b;
    private static final char h = '@';
    private static final char i = '-';
    private static final char j = '=';
    private static final char k = ',';
    private static final char l = ';';
    private static final char m = '.';
    private static final char n = '_';
    private static final char o = '\uffff';

    public dd(String string) {
        this(string, false);
    }

    public dd(String string, boolean bl2) {
        this.c = string.toCharArray();
        this.d = 0;
        this.e = new StringBuilder(this.c.length + 5);
        this.f = bl2;
    }

    private void k() {
        this.d = 0;
        this.e = new StringBuilder(this.c.length + 5);
    }

    private void a(char c2) {
        this.e.append(c2);
    }

    private void l() {
        this.a('_');
    }

    private String a(int n2) {
        return this.e.substring(n2);
    }

    private void a(int n2, String string) {
        this.e.delete(n2, this.e.length());
        this.e.insert(n2, string);
    }

    private void c(String string) {
        this.e.append(string);
    }

    private char m() {
        if (this.d == this.c.length) {
            ++this.d;
            return '\uffff';
        }
        return this.c[this.d++];
    }

    private void n() {
        while (!this.c(this.m())) {
        }
        --this.d;
    }

    private boolean o() {
        return this.d >= this.c.length || this.b(this.c[this.d]);
    }

    private boolean b(char c2) {
        return c2 == '@' || c2 == '\uffff' || c2 == '.';
    }

    private boolean c(char c2) {
        return c2 == '_' || c2 == '-' || this.b(c2);
    }

    private boolean p() {
        char c2;
        if (this.c.length > 2 && ((c2 = this.c[1]) == '-' || c2 == '_')) {
            c2 = this.c[0];
            return c2 == 'x' || c2 == 'X' || c2 == 'i' || c2 == 'I';
        }
        return false;
    }

    private boolean q() {
        for (int i2 = this.d; i2 < this.c.length; ++i2) {
            if (this.c[i2] != '=') continue;
            return true;
        }
        return false;
    }

    private int r() {
        String string;
        char c2;
        int n2 = this.e.length();
        if (this.p()) {
            this.a(com.ibm.icu.a.c.a.b(this.c[0]));
            this.a('-');
            this.d = 2;
        }
        while (!this.c(c2 = this.m())) {
            this.a(com.ibm.icu.a.c.a.b(c2));
        }
        --this.d;
        if (this.e.length() - n2 == 3 && (string = df.c(this.a(0))) != null) {
            this.a(0, string);
        }
        return 0;
    }

    private void s() {
        if (this.p()) {
            this.d = 2;
        }
        this.n();
    }

    private int t() {
        if (!this.o()) {
            char c2;
            int n2 = this.d++;
            int n3 = this.e.length();
            boolean bl2 = true;
            while (!this.c(c2 = this.m()) && com.ibm.icu.a.c.a.c(c2)) {
                if (bl2) {
                    this.l();
                    this.a(com.ibm.icu.a.c.a.a(c2));
                    bl2 = false;
                    continue;
                }
                this.a(com.ibm.icu.a.c.a.b(c2));
            }
            --this.d;
            if (this.d - n2 != 5) {
                this.d = n2;
                this.e.delete(n3, this.e.length());
            } else {
                ++n3;
            }
            return n3;
        }
        return this.e.length();
    }

    private void u() {
        if (!this.o()) {
            char c2;
            int n2 = this.d++;
            while (!this.c(c2 = this.m()) && com.ibm.icu.a.c.a.c(c2)) {
            }
            --this.d;
            if (this.d - n2 != 5) {
                this.d = n2;
            }
        }
    }

    private int v() {
        if (!this.o()) {
            char c2;
            int n2 = this.d++;
            int n3 = this.e.length();
            boolean bl2 = true;
            while (!this.c(c2 = this.m())) {
                if (bl2) {
                    this.g = true;
                    this.l();
                    ++n3;
                    bl2 = false;
                }
                this.a(com.ibm.icu.a.c.a.a(c2));
            }
            --this.d;
            int n4 = this.e.length() - n3;
            if (n4 != 0) {
                String string;
                if (n4 < 2 || n4 > 3) {
                    this.d = n2;
                    this.e.delete(--n3, this.e.length());
                    this.g = false;
                } else if (n4 == 3 && (string = df.d(this.a(n3))) != null) {
                    this.a(n3, string);
                }
            }
            return n3;
        }
        return this.e.length();
    }

    private void w() {
        if (!this.o()) {
            if (this.c[this.d] == '_' || this.c[this.d] == '-') {
                ++this.d;
            }
            int n2 = this.d;
            this.n();
            int n3 = this.d - n2;
            if (n3 < 2 || n3 > 3) {
                this.d = n2;
            }
        }
    }

    private int x() {
        char c2;
        int n2 = this.e.length();
        boolean bl2 = true;
        boolean bl3 = true;
        boolean bl4 = false;
        boolean bl5 = true;
        while ((c2 = this.m()) != '\uffff') {
            if (c2 == '.') {
                bl2 = false;
                bl4 = true;
                continue;
            }
            if (c2 == '@') {
                if (this.q()) break;
                bl4 = false;
                bl2 = false;
                bl3 = true;
                continue;
            }
            if (bl2) {
                bl2 = false;
                if (c2 == '_' || c2 == '-') continue;
                --this.d;
                continue;
            }
            if (bl4) continue;
            if (bl3) {
                bl3 = false;
                if (bl5 && !this.g) {
                    this.l();
                    ++n2;
                }
                this.l();
                if (bl5) {
                    ++n2;
                    bl5 = false;
                }
            }
            if ((c2 = com.ibm.icu.a.c.a.a(c2)) == '-' || c2 == ',') {
                c2 = '_';
            }
            this.a(c2);
        }
        --this.d;
        return n2;
    }

    public String a() {
        this.k();
        return this.a(this.r());
    }

    public String b() {
        this.k();
        this.s();
        return this.a(this.t());
    }

    public String c() {
        this.k();
        this.s();
        this.u();
        return this.a(this.v());
    }

    public String d() {
        this.k();
        this.s();
        this.u();
        this.w();
        return this.a(this.x());
    }

    public String[] e() {
        this.k();
        return new String[]{this.a(this.r()), this.a(this.t()), this.a(this.v()), this.a(this.x())};
    }

    public void a(String string) {
        this.b = string;
    }

    public void f() {
        if (this.b != null) {
            this.a(0, this.b);
        } else {
            this.k();
            this.r();
            this.t();
            this.v();
            this.x();
            int n2 = this.e.length();
            if (n2 > 0 && this.e.charAt(n2 - 1) == '_') {
                this.e.deleteCharAt(n2 - 1);
            }
        }
    }

    public String g() {
        if (this.b != null) {
            return this.b;
        }
        this.f();
        return this.a(0);
    }

    public String h() {
        this.f();
        this.C();
        return this.a(0);
    }

    private boolean y() {
        for (int i2 = this.d; i2 < this.c.length; ++i2) {
            if (this.c[i2] != '@') continue;
            if (this.f) {
                for (int i3 = ++i2; i3 < this.c.length; ++i3) {
                    if (this.c[i3] != '=') continue;
                    this.d = i2;
                    return true;
                }
                break;
            }
            if (++i2 >= this.c.length) break;
            this.d = i2;
            return true;
        }
        return false;
    }

    private static boolean d(char c2) {
        return c2 == '\uffff' || c2 == '=';
    }

    private static boolean e(char c2) {
        return c2 == '\uffff' || c2 == ';';
    }

    private String z() {
        int n2 = this.d;
        while (!dd.d(this.m())) {
        }
        --this.d;
        return com.ibm.icu.a.c.a.a(new String(this.c, n2, this.d - n2).trim());
    }

    private String A() {
        int n2 = this.d;
        while (!dd.e(this.m())) {
        }
        --this.d;
        return new String(this.c, n2, this.d - n2).trim();
    }

    private Comparator B() {
        de de2 = new de(this);
        return de2;
    }

    public Map i() {
        block6: {
            Map<String, String> map;
            block7: {
                String string;
                if (this.a != null) break block6;
                map = null;
                if (!this.y()) break block7;
                while ((string = this.z()).length() != 0) {
                    block9: {
                        String string2;
                        block11: {
                            block10: {
                                block8: {
                                    char c2 = this.m();
                                    if (c2 == '=') break block8;
                                    if (c2 == '\uffff') {
                                        break;
                                    }
                                    break block9;
                                }
                                string2 = this.A();
                                if (string2.length() == 0) break block9;
                                if (map != null) break block10;
                                map = new TreeMap(this.B());
                                break block11;
                            }
                            if (((TreeMap)map).containsKey(string)) break block9;
                        }
                        ((TreeMap)map).put(string, string2);
                    }
                    if (this.m() == ';') continue;
                }
            }
            this.a = map != null ? map : Collections.emptyMap();
        }
        return this.a;
    }

    private int C() {
        int n2 = this.e.length();
        Map map = this.i();
        if (!map.isEmpty()) {
            boolean bl2 = true;
            for (Map.Entry entry : map.entrySet()) {
                this.a(bl2 ? (char)'@' : ';');
                bl2 = false;
                this.c((String)entry.getKey());
                this.a('=');
                this.c((String)entry.getValue());
            }
            if (!bl2) {
                ++n2;
            }
        }
        return n2;
    }

    public Iterator j() {
        Map map = this.i();
        return map.isEmpty() ? null : map.keySet().iterator();
    }

    public String b(String string) {
        Map map = this.i();
        return map.isEmpty() ? null : (String)map.get(com.ibm.icu.a.c.a.a(string.trim()));
    }

    public void a(String string, String string2) {
        this.a(string, string2, false);
    }

    public void b(String string, String string2) {
        this.a(string, string2, true);
    }

    private void a(String string, String string2, boolean bl2) {
        if (string == null) {
            if (bl2) {
                this.a = Collections.emptyMap();
            }
        } else {
            if ((string = com.ibm.icu.a.c.a.a(string.trim())).length() == 0) {
                throw new IllegalArgumentException("keyword must not be empty");
            }
            if (string2 != null && (string2 = string2.trim()).length() == 0) {
                throw new IllegalArgumentException("value must not be empty");
            }
            Map map = this.i();
            if (map.isEmpty()) {
                if (string2 != null) {
                    this.a = new TreeMap(this.B());
                    this.a.put(string, string2.trim());
                }
            } else if (bl2 || !map.containsKey(string)) {
                if (string2 != null) {
                    map.put(string, string2);
                } else {
                    map.remove(string);
                    if (map.isEmpty()) {
                        this.a = Collections.emptyMap();
                    }
                }
            }
        }
    }
}

