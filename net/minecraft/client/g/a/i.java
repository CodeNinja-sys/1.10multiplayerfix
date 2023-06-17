/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.a;

import com.a.a.d.ov;
import java.util.List;
import net.minecraft.client.g.a.w;

public class i {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private List e;
    private w f;

    public i(int n2, int n3, int n4, int n5) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = n5;
    }

    public w a() {
        return this.f;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public boolean a(w w2) {
        if (this.f != null) {
            return false;
        }
        int n2 = w2.b();
        int n3 = w2.c();
        if (n2 <= this.c && n3 <= this.d) {
            if (n2 == this.c && n3 == this.d) {
                this.f = w2;
                return true;
            }
            if (this.e == null) {
                this.e = ov.b(1);
                this.e.add(new i(this.a, this.b, n2, n3));
                int n4 = this.c - n2;
                int n5 = this.d - n3;
                if (n5 > 0 && n4 > 0) {
                    int n6;
                    int n7 = Math.max(this.d, n4);
                    if (n7 >= (n6 = Math.max(this.c, n5))) {
                        this.e.add(new i(this.a, this.b + n3, n2, n5));
                        this.e.add(new i(this.a + n2, this.b, n4, this.d));
                    } else {
                        this.e.add(new i(this.a + n2, this.b, n4, n3));
                        this.e.add(new i(this.a, this.b + n3, this.c, n5));
                    }
                } else if (n4 == 0) {
                    this.e.add(new i(this.a, this.b + n3, n2, n5));
                } else if (n5 == 0) {
                    this.e.add(new i(this.a + n2, this.b, n4, n3));
                }
            }
            for (i i2 : this.e) {
                if (!i2.a(w2)) continue;
                return true;
            }
            return false;
        }
        return false;
    }

    public void a(List list) {
        if (this.f != null) {
            list.add(this);
        } else if (this.e != null) {
            for (i i2 : this.e) {
                i2.a(list);
            }
        }
    }

    public String toString() {
        return "Slot{originX=" + this.a + ", originY=" + this.b + ", width=" + this.c + ", height=" + this.d + ", texture=" + this.f + ", subSlots=" + this.e + '}';
    }
}

