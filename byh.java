/*
 * Decompiled with CFR 0.150.
 */
import java.io.DataInput;
import java.io.DataOutput;

public class byh
extends azt {
    private String b;

    public byh() {
        this.b = "";
    }

    public byh(String string) {
        this.b = string;
        if (string == null) {
            throw new IllegalArgumentException("Empty string not allowed");
        }
    }

    @Override
    void a(DataOutput dataOutput) {
        dataOutput.writeUTF(this.b);
    }

    @Override
    void a(DataInput dataInput, int n2, cny cny2) {
        cny2.a(288L);
        this.b = dataInput.readUTF();
        cny2.a(16 * this.b.length());
    }

    @Override
    public byte a() {
        return 8;
    }

    @Override
    public String toString() {
        return "\"" + this.b.replace("\"", "\\\"") + "\"";
    }

    public byh b() {
        return new byh(this.b);
    }

    @Override
    public boolean j() {
        return this.b.isEmpty();
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            byh byh2 = (byh)object;
            return this.b == null && byh2.b == null || this.b != null && this.b.equals(byh2.b);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.b.hashCode();
    }

    @Override
    public String k() {
        return this.b;
    }

    @Override
    public /* synthetic */ azt i() {
        return this.b();
    }
}

