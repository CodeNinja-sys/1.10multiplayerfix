/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Map;
import net.minecraft.c.a;
import org.apache.commons.b.t;

public class bzz {
    private final Map a = sz.c();
    private final String b;

    public bzz(String string) {
        this.b = string;
    }

    public ed a(a a2, bpx bpx2) {
        ed ed2 = this.b(a2, bpx2);
        if (ed2 == null) {
            ed2 = new ed();
            this.a.put(bpx2.b(), ed2);
        }
        return ed2;
    }

    public ed b(a a2, bpx bpx2) {
        String string = bpx2.b();
        if (this.a.containsKey(string)) {
            return (ed)this.a.get(string);
        }
        if (a2 != null) {
            this.c(a2, bpx2);
        } else {
            this.b(bpx2);
        }
        if (this.a.containsKey(string)) {
            return (ed)this.a.get(string);
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean c(a a2, bpx bpx2) {
        String string = bpx2.b();
        File file = new File(this.b, string + ".nbt");
        if (!file.exists()) {
            return this.b(bpx2);
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
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean b(bpx bpx2) {
        String string = bpx2.c();
        String string2 = bpx2.b();
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
        bvp bvp2 = cyb.a(inputStream);
        ed ed2 = new ed();
        ed2.b(bvp2);
        this.a.put(string, ed2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean d(a a2, bpx bpx2) {
        String string = bpx2.b();
        if (a2 == null || !this.a.containsKey(string)) {
            return false;
        }
        File file = new File(this.b);
        if (!file.exists() ? !file.mkdirs() : !file.isDirectory()) {
            return false;
        }
        File file2 = new File(file, string + ".nbt");
        ed ed2 = (ed)this.a.get(string);
        FileOutputStream fileOutputStream = null;
        try {
            bvp bvp2 = ed2.a(new bvp());
            fileOutputStream = new FileOutputStream(file2);
            cyb.a(bvp2, fileOutputStream);
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

    public void a(bpx bpx2) {
        this.a.remove(bpx2.b());
    }
}

