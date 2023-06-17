/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a;

import com.a.a.b.aj;
import com.a.a.c.ab;
import com.a.a.i.bi;
import com.a.a.i.cn;
import com.a.b.aa;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import net.minecraft.q.a.a.c;
import net.minecraft.q.a.a.i;
import net.minecraft.u.bp;

class p
extends ab {
    final /* synthetic */ c a;

    private p(c c2) {
        this.a = c2;
    }

    public i a(bp bp2) {
        if (bp2.b().contains(".")) {
            c.b().a("Invalid loot table name '{}' (can't contain periods)", bp2);
            return i.a;
        }
        i i2 = this.b(bp2);
        if (i2 == null) {
            i2 = this.c(bp2);
        }
        if (i2 == null) {
            i2 = i.a;
            c.b().f("Couldn't find resource table {}", bp2);
        }
        return i2;
    }

    private i b(bp bp2) {
        File file = new File(new File(c.a(this.a), bp2.c()), String.valueOf(bp2.b()) + ".json");
        if (file.exists()) {
            if (file.isFile()) {
                String string;
                try {
                    string = bi.f(file, aj.c);
                }
                catch (IOException iOException) {
                    c.b().f("Couldn't load loot table {} from {}", bp2, file, iOException);
                    return i.a;
                }
                try {
                    return (i)c.c().a(string, i.class);
                }
                catch (aa aa2) {
                    c.b().b("Couldn't load loot table {} from {}", bp2, file, aa2);
                    return i.a;
                }
            }
            c.b().f("Expected to find loot table {} at {} but it was a folder.", bp2, file);
            return i.a;
        }
        return null;
    }

    private i c(bp bp2) {
        URL uRL = c.class.getResource("/assets/" + bp2.c() + "/loot_tables/" + bp2.b() + ".json");
        if (uRL != null) {
            String string;
            try {
                string = cn.c(uRL, aj.c);
            }
            catch (IOException iOException) {
                c.b().f("Couldn't load loot table {} from {}", bp2, uRL, iOException);
                return i.a;
            }
            try {
                return (i)c.c().a(string, i.class);
            }
            catch (aa aa2) {
                c.b().b("Couldn't load loot table {} from {}", bp2, uRL, aa2);
                return i.a;
            }
        }
        return null;
    }

    @Override
    public /* synthetic */ Object a(Object object) {
        return this.a((bp)object);
    }

    /* synthetic */ p(c c2, p p2) {
        this(c2);
    }
}

