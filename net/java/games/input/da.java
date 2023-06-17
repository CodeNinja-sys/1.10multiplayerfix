/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import net.java.games.input.RawDevice;
import net.java.games.input.ar;
import net.java.games.input.au;
import net.java.games.input.cv;
import net.java.games.input.db;
import net.java.games.input.dc;
import net.java.games.input.dj;
import net.java.games.input.k;
import net.java.games.input.l;
import net.java.games.input.o;
import net.java.games.input.q;

final class da
extends au {
    private final dc c = new dc();
    private final RawDevice d;
    static Class a;

    protected da(String string, RawDevice rawDevice, q[] arrq, dj[] arrdj) {
        super(string, da.a(rawDevice), arrq, arrdj);
        this.d = rawDevice;
    }

    private static final k[] a(RawDevice rawDevice) {
        ArrayList<db> arrayList = new ArrayList<db>();
        Field[] arrfield = (a == null ? (a = da.a("net.java.games.input.cv")) : a).getFields();
        for (int i2 = 0; i2 < arrfield.length; ++i2) {
            Field field = arrfield[i2];
            try {
                int n2;
                o o2;
                if (!Modifier.isStatic(field.getModifiers()) || field.getType() != Integer.TYPE || (o2 = cv.a(n2 = field.getInt(null))) == o.bu) continue;
                arrayList.add(new db(rawDevice, n2, o2));
                continue;
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new RuntimeException(illegalAccessException);
            }
        }
        return arrayList.toArray(new k[0]);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected final synchronized boolean a(ar var1_1) {
        do lbl-1000:
        // 3 sources

        {
            if (!this.d.a(this.c)) {
                return false;
            }
            var2_2 = this.c.a();
            var3_3 = cv.a(var2_2);
            var4_4 = this.a((l)var3_3);
            if (var4_4 == null) ** GOTO lbl-1000
            var5_5 = this.c.b();
            if (var5_5 != 256 && var5_5 != 260) continue;
            var1_1.a(var4_4, 1.0f, this.c.c());
            return true;
        } while (var5_5 != 257 && var5_5 != 261);
        var1_1.a(var4_4, 0.0f, this.c.c());
        return true;
    }

    public final void a() {
        this.d.b();
    }

    protected final void a(int n2) {
        this.d.c(n2);
    }

    static Class a(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError().initCause(classNotFoundException);
        }
    }
}

