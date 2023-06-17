/*
 * Decompiled with CFR 0.150.
 */
import java.util.BitSet;
import java.util.Set;

public class gy {
    private static final int a = bqk.values().length;
    private final BitSet b = new BitSet(a * a);

    public void a(Set set) {
        for (bqk bqk2 : set) {
            for (bqk bqk3 : set) {
                this.a(bqk2, bqk3, true);
            }
        }
    }

    public void a(bqk bqk2, bqk bqk3, boolean bl2) {
        this.b.set(bqk2.ordinal() + bqk3.ordinal() * a, bl2);
        this.b.set(bqk3.ordinal() + bqk2.ordinal() * a, bl2);
    }

    public void a(boolean bl2) {
        this.b.set(0, this.b.size(), bl2);
    }

    public boolean a(bqk bqk2, bqk bqk3) {
        return this.b.get(bqk2.ordinal() + bqk3.ordinal() * a);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(' ');
        for (bqk bqk2 : bqk.values()) {
            stringBuilder.append(' ').append(bqk2.toString().toUpperCase().charAt(0));
        }
        stringBuilder.append('\n');
        for (bqk bqk2 : bqk.values()) {
            stringBuilder.append(bqk2.toString().toUpperCase().charAt(0));
            for (bqk bqk3 : bqk.values()) {
                if (bqk2 == bqk3) {
                    stringBuilder.append("  ");
                    continue;
                }
                boolean bl2 = this.a(bqk2, bqk3);
                stringBuilder.append(' ').append(bl2 ? (char)'Y' : 'n');
            }
            stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }
}

