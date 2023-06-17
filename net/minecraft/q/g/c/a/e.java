/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c.a;

import com.a.a.d.sz;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Map;
import net.minecraft.c.a;
import net.minecraft.q.g.c.a.h;
import net.minecraft.u.bp;
import org.apache.commons.b.t;

public class e {
    private final Map a = sz.c();
    private final String b;

    public e(String string) {
        this.b = string;
    }

    public h a(a a2, bp bp2) {
        h h2 = this.b(a2, bp2);
        if (h2 == null) {
            h2 = new h();
            this.a.put(bp2.b(), h2);
        }
        return h2;
    }

    public h b(a a2, bp bp2) {
        String string = bp2.b();
        if (this.a.containsKey(string)) {
            return (h)this.a.get(string);
        }
        if (a2 != null) {
            this.c(a2, bp2);
        } else {
            this.b(bp2);
        }
        return this.a.containsKey(string) ? (h)this.a.get(string) : null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean c(a a2, bp bp2) {
        String string = bp2.b();
        File file = new File(this.b, String.valueOf(string) + ".nbt");
        if (!file.exists()) {
            return this.b(bp2);
        }
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            this.a(string, fileInputStream);
        }
        catch (Throwable throwable) {
            boolean bl2;
            try {
                bl2 = false;
            }
            catch (Throwable throwable2) {
                t.a(fileInputStream);
                throw throwable2;
            }
            t.a(fileInputStream);
            return bl2;
        }
        t.a(fileInputStream);
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean b(bp bp2) {
        String string = bp2.c();
        String string2 = bp2.b();
        InputStream inputStream = null;
        try {
            inputStream = a.class.getResourceAsStream("/assets/" + string + "/structures/" + string2 + ".nbt");
            this.a(string2, inputStream);
        }
        catch (Throwable throwable) {
            try {
                boolean bl2 = false;
                return bl2;
            }
            catch (Throwable throwable2) {
                throw throwable2;
            }
            finally {
                t.a(inputStream);
            }
        }
        t.a(inputStream);
        return true;
    }

    private void a(String string, InputStream inputStream) {
        net.minecraft.e.e e2 = net.minecraft.e.h.a(inputStream);
        h h2 = new h();
        h2.b(e2);
        this.a.put(string, h2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean d(a a2, bp bp2) {
        String string = bp2.b();
        if (a2 == null || !this.a.containsKey(string)) return false;
        File file = new File(this.b);
        if (!file.exists() ? !file.mkdirs() : !file.isDirectory()) {
            return false;
        }
        File file2 = new File(file, String.valueOf(string) + ".nbt");
        h h2 = (h)this.a.get(string);
        FileOutputStream fileOutputStream = null;
        try {
            net.minecraft.e.e e2 = h2.a(new net.minecraft.e.e());
            fileOutputStream = new FileOutputStream(file2);
            net.minecraft.e.h.a(e2, fileOutputStream);
        }
        catch (Throwable throwable) {
            try {
                boolean bl2 = false;
                return bl2;
            }
            catch (Throwable throwable2) {
                throw throwable2;
            }
            finally {
                t.a(fileOutputStream);
            }
        }
        t.a(fileOutputStream);
        return true;
    }

    public void a(bp bp2) {
        this.a.remove(bp2.b());
    }
}

