/*
 * Decompiled with CFR 0.150.
 */
package e.a.a;

import e.a.e;
import e.a.n;
import e.a.p;
import e.a.t;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

public class b
implements e {
    private static final boolean a = false;
    private static final boolean b = true;
    private static final boolean c = false;
    private boolean d = false;
    private boolean e = false;
    private AudioInputStream f = null;
    private t g = p.b();

    public void a(boolean bl2) {
    }

    public boolean a(URL uRL) {
        this.a(true, false);
        this.e();
        if (uRL == null) {
            this.a("url null in method 'initialize'");
            this.e();
            return false;
        }
        try {
            this.f = AudioSystem.getAudioInputStream(new BufferedInputStream(uRL.openStream()));
        }
        catch (UnsupportedAudioFileException unsupportedAudioFileException) {
            this.a("Unsupported audio format in method 'initialize'");
            this.a(unsupportedAudioFileException);
            return false;
        }
        catch (IOException iOException) {
            this.a("Error setting up audio input stream in method 'initialize'");
            this.a(iOException);
            return false;
        }
        this.b(true, false);
        this.a(true, true);
        return true;
    }

    public boolean a() {
        return this.a(false, false);
    }

    public n b() {
        int n2;
        if (this.f == null) {
            return null;
        }
        AudioFormat audioFormat = this.f.getFormat();
        if (audioFormat == null) {
            this.a("Audio Format null in method 'read'");
            return null;
        }
        int n3 = 0;
        byte[] arrby = new byte[p.l()];
        try {
            for (n2 = 0; !this.b(false, false) && n2 < arrby.length; n2 += n3) {
                n3 = this.f.read(arrby, n2, arrby.length - n2);
                if (n3 > 0) continue;
                this.b(true, true);
                break;
            }
        }
        catch (IOException iOException) {
            this.b(true, true);
            return null;
        }
        if (n2 <= 0) {
            return null;
        }
        if (n2 < arrby.length) {
            arrby = e.a.a.b.a(arrby, n2);
        }
        byte[] arrby2 = e.a.a.b.a(arrby, audioFormat.getSampleSizeInBits() == 16);
        n n4 = new n(arrby2, audioFormat);
        return n4;
    }

    public n c() {
        int n2;
        int n3;
        if (this.f == null) {
            this.a("Audio input stream null in method 'readAll'");
            return null;
        }
        AudioFormat audioFormat = this.f.getFormat();
        if (audioFormat == null) {
            this.a("Audio Format null in method 'readAll'");
            return null;
        }
        byte[] arrby = null;
        int n4 = audioFormat.getChannels() * (int)this.f.getFrameLength() * audioFormat.getSampleSizeInBits() / 8;
        if (n4 > 0) {
            arrby = new byte[audioFormat.getChannels() * (int)this.f.getFrameLength() * audioFormat.getSampleSizeInBits() / 8];
            n3 = 0;
            try {
                for (n2 = 0; (n3 = this.f.read(arrby, n2, arrby.length - n2)) != -1 && n2 < arrby.length; n2 += n3) {
                }
            }
            catch (IOException iOException) {
                this.a("Exception thrown while reading from the AudioInputStream (location #1).");
                this.a(iOException);
                return null;
            }
        }
        n2 = 0;
        int n5 = 0;
        byte[] arrby2 = null;
        arrby2 = new byte[p.p()];
        for (n3 = 0; !this.b(false, false) && n3 < p.o(); n3 += n2) {
            n5 = 0;
            try {
                for (n2 = 0; n2 < arrby2.length; n2 += n5) {
                    n5 = this.f.read(arrby2, n2, arrby2.length - n2);
                    if (n5 > 0) continue;
                    this.b(true, true);
                    break;
                }
            }
            catch (IOException iOException) {
                this.a("Exception thrown while reading from the AudioInputStream (location #2).");
                this.a(iOException);
                return null;
            }
            arrby = e.a.a.b.a(arrby, arrby2, n2);
        }
        byte[] arrby3 = e.a.a.b.a(arrby, audioFormat.getSampleSizeInBits() == 16);
        n n6 = new n(arrby3, audioFormat);
        try {
            this.f.close();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return n6;
    }

    public boolean d() {
        return this.b(false, false);
    }

    public void e() {
        if (this.f != null) {
            try {
                this.f.close();
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        this.f = null;
    }

    public AudioFormat f() {
        if (this.f == null) {
            return null;
        }
        return this.f.getFormat();
    }

    private synchronized boolean a(boolean bl2, boolean bl3) {
        if (bl2) {
            this.e = bl3;
        }
        return this.e;
    }

    private synchronized boolean b(boolean bl2, boolean bl3) {
        if (bl2) {
            this.d = bl3;
        }
        return this.d;
    }

    private static byte[] a(byte[] arrby, int n2) {
        byte[] arrby2 = null;
        if (arrby != null && arrby.length > n2) {
            arrby2 = new byte[n2];
            System.arraycopy(arrby, 0, arrby2, 0, n2);
        }
        return arrby2;
    }

    private static byte[] a(byte[] arrby, boolean bl2) {
        Object object;
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(arrby.length);
        byteBuffer.order(ByteOrder.nativeOrder());
        ByteBuffer byteBuffer2 = ByteBuffer.wrap(arrby);
        byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
        if (bl2) {
            object = byteBuffer.asShortBuffer();
            ShortBuffer shortBuffer = byteBuffer2.asShortBuffer();
            while (shortBuffer.hasRemaining()) {
                ((ShortBuffer)object).put(shortBuffer.get());
            }
        } else {
            while (byteBuffer2.hasRemaining()) {
                byteBuffer.put(byteBuffer2.get());
            }
        }
        byteBuffer.rewind();
        if (!byteBuffer.hasArray()) {
            object = new byte[byteBuffer.capacity()];
            byteBuffer.get((byte[])object);
            byteBuffer.clear();
            return object;
        }
        return byteBuffer.array();
    }

    private static byte[] a(byte[] arrby, byte[] arrby2, int n2) {
        byte[] arrby3;
        if (arrby == null && arrby2 == null) {
            return null;
        }
        if (arrby == null) {
            arrby3 = new byte[n2];
            System.arraycopy(arrby2, 0, arrby3, 0, n2);
            arrby2 = null;
        } else if (arrby2 == null) {
            arrby3 = new byte[arrby.length];
            System.arraycopy(arrby, 0, arrby3, 0, arrby.length);
            arrby = null;
        } else {
            arrby3 = new byte[arrby.length + n2];
            System.arraycopy(arrby, 0, arrby3, 0, arrby.length);
            System.arraycopy(arrby2, 0, arrby3, arrby.length, n2);
            arrby = null;
            arrby2 = null;
        }
        return arrby3;
    }

    private void a(String string) {
        this.g.a("CodecWav", string, 0);
    }

    private void a(Exception exception) {
        this.g.a(exception, 1);
    }
}

