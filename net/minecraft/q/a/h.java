/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a;

import com.a.a.d.ov;
import com.a.a.d.sz;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.util.List;
import java.util.Map;
import net.minecraft.e.a;
import net.minecraft.e.e;
import net.minecraft.e.w;
import net.minecraft.q.a.u;
import net.minecraft.q.f;

public class h {
    private final u b;
    protected Map a = sz.c();
    private final List c = ov.a();
    private final Map d = sz.c();

    public h(u u2) {
        this.b = u2;
        this.b();
    }

    public f a(Class class_, String string) {
        f f2;
        block7: {
            f2 = (f)this.a.get(string);
            if (f2 != null) {
                return f2;
            }
            if (this.b != null) {
                try {
                    File file = this.b.a(string);
                    if (file == null || !file.exists()) break block7;
                    try {
                        f2 = (f)class_.getConstructor(String.class).newInstance(string);
                    }
                    catch (Exception exception) {
                        throw new RuntimeException("Failed to instantiate " + class_, exception);
                    }
                    FileInputStream fileInputStream = new FileInputStream(file);
                    e e2 = net.minecraft.e.h.a(fileInputStream);
                    fileInputStream.close();
                    f2.a(e2.o("data"));
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
        if (f2 != null) {
            this.a.put(string, f2);
            this.c.add(f2);
        }
        return f2;
    }

    public void a(String string, f f2) {
        if (this.a.containsKey(string)) {
            this.c.remove(this.a.remove(string));
        }
        this.a.put(string, f2);
        this.c.add(f2);
    }

    public void a() {
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            f f2 = (f)this.c.get(i2);
            if (!f2.e()) continue;
            this.a(f2);
            f2.a(false);
        }
    }

    private void a(f f2) {
        if (this.b != null) {
            try {
                File file = this.b.a(f2.i);
                if (file != null) {
                    e e2 = new e();
                    e2.a("data", f2.b(new e()));
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    net.minecraft.e.h.a(e2, fileOutputStream);
                    fileOutputStream.close();
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    private void b() {
        try {
            this.d.clear();
            if (this.b == null) {
                return;
            }
            File file = this.b.a("idcounts");
            if (file != null && file.exists()) {
                DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                e e2 = net.minecraft.e.h.a(dataInputStream);
                dataInputStream.close();
                for (String string : e2.e()) {
                    a a2 = e2.c(string);
                    if (!(a2 instanceof w)) continue;
                    w w2 = (w)a2;
                    short s2 = w2.h();
                    this.d.put(string, s2);
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public int a(String string) {
        Short s2 = (Short)this.d.get(string);
        s2 = s2 == null ? Short.valueOf((short)0) : Short.valueOf((short)(s2 + 1));
        this.d.put(string, s2);
        if (this.b == null) {
            return s2.shortValue();
        }
        try {
            File file = this.b.a("idcounts");
            if (file != null) {
                Object object2;
                e e2 = new e();
                for (Object object2 : this.d.keySet()) {
                    e2.a((String)object2, (Short)this.d.get(object2));
                }
                object2 = new DataOutputStream(new FileOutputStream(file));
                net.minecraft.e.h.a(e2, (DataOutput)object2);
                ((FilterOutputStream)object2).close();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return s2.shortValue();
    }
}

