/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;

public class bkj {
    private final ajq b;
    protected Map a = sz.c();
    private final List c = ov.a();
    private final Map d = sz.c();

    public bkj(ajq ajq2) {
        this.b = ajq2;
        this.b();
    }

    public bh a(Class class_, String string) {
        bh bh2;
        block7: {
            bh2 = (bh)this.a.get(string);
            if (bh2 != null) {
                return bh2;
            }
            if (this.b != null) {
                try {
                    File file = this.b.a(string);
                    if (file == null || !file.exists()) break block7;
                    try {
                        bh2 = (bh)class_.getConstructor(String.class).newInstance(string);
                    }
                    catch (Exception exception) {
                        throw new RuntimeException("Failed to instantiate " + class_, exception);
                    }
                    FileInputStream fileInputStream = new FileInputStream(file);
                    bvp bvp2 = cyb.a(fileInputStream);
                    fileInputStream.close();
                    bh2.a(bvp2.o("data"));
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
        if (bh2 != null) {
            this.a.put(string, bh2);
            this.c.add(bh2);
        }
        return bh2;
    }

    public void a(String string, bh bh2) {
        if (this.a.containsKey(string)) {
            this.c.remove(this.a.remove(string));
        }
        this.a.put(string, bh2);
        this.c.add(bh2);
    }

    public void a() {
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            bh bh2 = (bh)this.c.get(i2);
            if (!bh2.b()) continue;
            this.a(bh2);
            bh2.a(false);
        }
    }

    private void a(bh bh2) {
        if (this.b == null) {
            return;
        }
        try {
            File file = this.b.a(bh2.a);
            if (file != null) {
                bvp bvp2 = new bvp();
                bvp2.a("data", bh2.b(new bvp()));
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                cyb.a(bvp2, fileOutputStream);
                fileOutputStream.close();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
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
                bvp bvp2 = cyb.a(dataInputStream);
                dataInputStream.close();
                for (String string : bvp2.b()) {
                    azt azt2 = bvp2.c(string);
                    if (!(azt2 instanceof ph)) continue;
                    ph ph2 = (ph)azt2;
                    short s2 = ph2.e();
                    this.d.put(string, s2);
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public int a(String string) {
        Object object;
        Comparable<Short> comparable;
        Short s2 = (Short)this.d.get(string);
        if (s2 == null) {
            s2 = 0;
        } else {
            comparable = s2;
            s2 = (short)(s2 + 1);
            object = s2;
        }
        this.d.put(string, s2);
        if (this.b == null) {
            return s2.shortValue();
        }
        try {
            comparable = this.b.a("idcounts");
            if (comparable != null) {
                object = new bvp();
                for (String string2 : this.d.keySet()) {
                    ((bvp)object).a(string2, (Short)this.d.get(string2));
                }
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream((File)comparable));
                cyb.a((bvp)object, (DataOutput)dataOutputStream);
                dataOutputStream.close();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return s2.shortValue();
    }
}

