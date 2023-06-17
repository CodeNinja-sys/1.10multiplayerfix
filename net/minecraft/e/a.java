/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.e;

import java.io.DataInput;
import java.io.DataOutput;
import net.minecraft.e.aa;
import net.minecraft.e.b;
import net.minecraft.e.e;
import net.minecraft.e.g;
import net.minecraft.e.j;
import net.minecraft.e.l;
import net.minecraft.e.o;
import net.minecraft.e.q;
import net.minecraft.e.r;
import net.minecraft.e.s;
import net.minecraft.e.t;
import net.minecraft.e.w;
import net.minecraft.e.y;

public abstract class a {
    public static final String[] a = new String[]{"END", "BYTE", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE", "BYTE[]", "STRING", "LIST", "COMPOUND", "INT[]"};

    abstract void a(DataOutput var1);

    abstract void a(DataInput var1, int var2, l var3);

    public abstract String toString();

    public abstract byte a();

    protected static a a(byte by2) {
        switch (by2) {
            case 0: {
                return new g();
            }
            case 1: {
                return new aa();
            }
            case 2: {
                return new w();
            }
            case 3: {
                return new r();
            }
            case 4: {
                return new t();
            }
            case 5: {
                return new b();
            }
            case 6: {
                return new s();
            }
            case 7: {
                return new j();
            }
            case 8: {
                return new y();
            }
            case 9: {
                return new q();
            }
            case 10: {
                return new e();
            }
            case 11: {
                return new o();
            }
        }
        return null;
    }

    public abstract a b();

    public boolean c() {
        return false;
    }

    public boolean equals(Object object) {
        if (!(object instanceof a)) {
            return false;
        }
        a a2 = (a)object;
        return this.a() == a2.a();
    }

    public int hashCode() {
        return this.a();
    }

    protected String d() {
        return this.toString();
    }
}

