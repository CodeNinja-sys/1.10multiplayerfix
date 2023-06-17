/*
 * Decompiled with CFR 0.150.
 */
import java.io.DataInput;
import java.io.DataOutput;

public abstract class azt {
    public static final String[] a = new String[]{"END", "BYTE", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE", "BYTE[]", "STRING", "LIST", "COMPOUND", "INT[]"};

    abstract void a(DataOutput var1);

    abstract void a(DataInput var1, int var2, cny var3);

    public abstract String toString();

    public abstract byte a();

    protected azt() {
    }

    protected static azt a(byte by2) {
        switch (by2) {
            case 0: {
                return new bqf();
            }
            case 1: {
                return new xg();
            }
            case 2: {
                return new ph();
            }
            case 3: {
                return new iq();
            }
            case 4: {
                return new ij();
            }
            case 5: {
                return new po();
            }
            case 6: {
                return new cab();
            }
            case 7: {
                return new dge();
            }
            case 11: {
                return new aya();
            }
            case 8: {
                return new byh();
            }
            case 9: {
                return new bmh();
            }
            case 10: {
                return new bvp();
            }
        }
        return null;
    }

    public abstract azt i();

    public boolean j() {
        return false;
    }

    public boolean equals(Object object) {
        if (!(object instanceof azt)) {
            return false;
        }
        azt azt2 = (azt)object;
        return this.a() == azt2.a();
    }

    public int hashCode() {
        return this.a();
    }

    protected String k() {
        return this.toString();
    }
}

