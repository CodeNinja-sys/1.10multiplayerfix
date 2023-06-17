/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util;

import com.sun.media.sound.WaveFileReader;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import org.lwjgl.d;

public class n {
    public final ByteBuffer a;
    public final int b;
    public final int c;

    private n(ByteBuffer byteBuffer, int n2, int n3) {
        this.a = byteBuffer;
        this.b = n2;
        this.c = n3;
    }

    public void a() {
        this.a.clear();
    }

    public static n a(URL uRL) {
        try {
            WaveFileReader waveFileReader = new WaveFileReader();
            return n.a(waveFileReader.getAudioInputStream(new BufferedInputStream(uRL.openStream())));
        }
        catch (Exception exception) {
            org.lwjgl.d.a((CharSequence)("Unable to create from: " + uRL + ", " + exception.getMessage()));
            return null;
        }
    }

    public static n a(String string) {
        return n.a(Thread.currentThread().getContextClassLoader().getResource(string));
    }

    public static n a(InputStream inputStream) {
        try {
            return n.a(AudioSystem.getAudioInputStream(inputStream));
        }
        catch (Exception exception) {
            org.lwjgl.d.a((CharSequence)("Unable to create from inputstream, " + exception.getMessage()));
            return null;
        }
    }

    public static n a(byte[] arrby) {
        try {
            return n.a(AudioSystem.getAudioInputStream(new BufferedInputStream(new ByteArrayInputStream(arrby))));
        }
        catch (Exception exception) {
            org.lwjgl.d.a((CharSequence)("Unable to create from byte array, " + exception.getMessage()));
            return null;
        }
    }

    public static n a(ByteBuffer byteBuffer) {
        try {
            byte[] arrby = null;
            if (byteBuffer.hasArray()) {
                arrby = byteBuffer.array();
            } else {
                arrby = new byte[byteBuffer.capacity()];
                byteBuffer.get(arrby);
            }
            return n.a(arrby);
        }
        catch (Exception exception) {
            org.lwjgl.d.a((CharSequence)("Unable to create from ByteBuffer, " + exception.getMessage()));
            return null;
        }
    }

    public static n a(AudioInputStream audioInputStream) {
        AudioFormat audioFormat = audioInputStream.getFormat();
        int n2 = 0;
        if (audioFormat.getChannels() == 1) {
            if (audioFormat.getSampleSizeInBits() == 8) {
                n2 = 4352;
            } else if (audioFormat.getSampleSizeInBits() == 16) {
                n2 = 4353;
            } else assert (false) : "Illegal sample size";
        } else if (audioFormat.getChannels() == 2) {
            if (audioFormat.getSampleSizeInBits() == 8) {
                n2 = 4354;
            } else if (audioFormat.getSampleSizeInBits() == 16) {
                n2 = 4355;
            } else assert (false) : "Illegal sample size";
        } else assert (false) : "Only mono or stereo is supported";
        ByteBuffer byteBuffer = null;
        try {
            int n3 = audioInputStream.available();
            if (n3 <= 0) {
                n3 = audioInputStream.getFormat().getChannels() * (int)audioInputStream.getFrameLength() * audioInputStream.getFormat().getSampleSizeInBits() / 8;
            }
            byte[] arrby = new byte[audioInputStream.available()];
            int n4 = 0;
            for (int i2 = 0; (n4 = audioInputStream.read(arrby, i2, arrby.length - i2)) != -1 && i2 < arrby.length; i2 += n4) {
            }
            byteBuffer = n.a(arrby, audioFormat.getSampleSizeInBits() == 16, audioFormat.isBigEndian() ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        }
        catch (IOException iOException) {
            return null;
        }
        n n5 = new n(byteBuffer, n2, (int)audioFormat.getSampleRate());
        try {
            audioInputStream.close();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return n5;
    }

    private static ByteBuffer a(byte[] arrby, boolean bl2, ByteOrder byteOrder) {
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(arrby.length);
        byteBuffer.order(ByteOrder.nativeOrder());
        ByteBuffer byteBuffer2 = ByteBuffer.wrap(arrby);
        byteBuffer2.order(byteOrder);
        if (bl2) {
            ShortBuffer shortBuffer = byteBuffer.asShortBuffer();
            ShortBuffer shortBuffer2 = byteBuffer2.asShortBuffer();
            while (shortBuffer2.hasRemaining()) {
                shortBuffer.put(shortBuffer2.get());
            }
        } else {
            while (byteBuffer2.hasRemaining()) {
                byteBuffer.put(byteBuffer2.get());
            }
        }
        byteBuffer.rewind();
        return byteBuffer;
    }
}

