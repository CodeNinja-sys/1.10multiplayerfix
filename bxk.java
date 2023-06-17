/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.aj;
import com.a.a.c.ab;
import com.a.a.i.bi;
import com.a.a.i.cn;
import com.a.b.aa;
import java.io.File;
import java.io.IOException;
import java.net.URL;

class bxk
extends ab {
    final /* synthetic */ baz a;

    private bxk(baz baz2) {
        this.a = baz2;
    }

    public cse a(bpx bpx2) {
        if (bpx2.b().contains(".")) {
            baz.b().a("Invalid loot table name '{}' (can't contain periods)", bpx2);
            return cse.a;
        }
        cse cse2 = this.b(bpx2);
        if (cse2 == null) {
            cse2 = this.c(bpx2);
        }
        if (cse2 == null) {
            cse2 = cse.a;
            baz.b().f("Couldn't find resource table {}", bpx2);
        }
        return cse2;
    }

    private cse b(bpx bpx2) {
        File file = new File(new File(baz.a(this.a), bpx2.c()), bpx2.b() + ".json");
        if (file.exists()) {
            if (file.isFile()) {
                String string;
                try {
                    string = bi.f(file, aj.c);
                }
                catch (IOException iOException) {
                    baz.b().f("Couldn't load loot table {} from {}", bpx2, file, iOException);
                    return cse.a;
                }
                try {
                    return (cse)baz.c().a(string, cse.class);
                }
                catch (aa aa2) {
                    baz.b().b("Couldn't load loot table {} from {}", bpx2, file, aa2);
                    return cse.a;
                }
            }
            baz.b().f("Expected to find loot table {} at {} but it was a folder.", bpx2, file);
            return cse.a;
        }
        return null;
    }

    private cse c(bpx bpx2) {
        URL uRL = baz.class.getResource("/assets/" + bpx2.c() + "/loot_tables/" + bpx2.b() + ".json");
        if (uRL != null) {
            String string;
            try {
                string = cn.c(uRL, aj.c);
            }
            catch (IOException iOException) {
                baz.b().f("Couldn't load loot table {} from {}", bpx2, uRL, iOException);
                return cse.a;
            }
            try {
                return (cse)baz.c().a(string, cse.class);
            }
            catch (aa aa2) {
                baz.b().b("Couldn't load loot table {} from {}", bpx2, uRL, aa2);
                return cse.a;
            }
        }
        return null;
    }

    @Override
    public /* synthetic */ Object a(Object object) {
        return this.a((bpx)object);
    }

    /* synthetic */ bxk(baz baz2, ah ah2) {
        this(baz2);
    }
}

