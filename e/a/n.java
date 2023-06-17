/*
 * Decompiled with CFR 0.150.
 */
package e.a;

import javax.sound.sampled.AudioFormat;

public class n {
    public byte[] a;
    public AudioFormat b;

    public n(byte[] arrby, AudioFormat audioFormat) {
        this.a = arrby;
        this.b = audioFormat;
    }

    public void a() {
        this.a = null;
        this.b = null;
    }

    public void a(int n2) {
        if (this.a == null || n2 == 0) {
            this.a = null;
        } else if (this.a.length > n2) {
            byte[] arrby = new byte[n2];
            System.arraycopy(this.a, 0, arrby, 0, n2);
            this.a = arrby;
        }
    }
}

