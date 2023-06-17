/*
 * Decompiled with CFR 0.150.
 */
package e.a;

import e.a.d;
import e.a.k;
import e.a.o;
import e.a.p;
import e.a.s;
import e.a.t;
import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.ListIterator;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Receiver;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Synthesizer;

public class i
implements MetaEventListener {
    private t f;
    private d g;
    private String h;
    private static final int i = 7;
    private static final int j = 47;
    private static final boolean k = false;
    private static final boolean l = true;
    private static final boolean m = false;
    private Sequencer n = null;
    private Synthesizer o = null;
    private MidiDevice p = null;
    private Sequence q = null;
    private boolean r = true;
    private float s = 1.0f;
    private boolean t = true;
    private LinkedList u = null;
    private final Object v = new Object();
    protected float a = -1.0f;
    protected float b = 1.0f;
    protected long c = 0L;
    protected long d = 0L;
    protected long e = 0L;
    private k w = null;

    public i(boolean bl2, String string, String string2) {
        this.b(true, true);
        this.f = e.a.p.b();
        this.a(true, new d(string2));
        this.b(true, string);
        this.a(bl2);
        this.m();
        this.b(true, false);
    }

    public i(boolean bl2, String string, URL uRL, String string2) {
        this.b(true, true);
        this.f = e.a.p.b();
        this.a(true, new d(uRL, string2));
        this.b(true, string);
        this.a(bl2);
        this.m();
        this.b(true, false);
    }

    public i(boolean bl2, String string, d d2) {
        this.b(true, true);
        this.f = e.a.p.b();
        this.a(true, d2);
        this.b(true, string);
        this.a(bl2);
        this.m();
        this.b(true, false);
    }

    private void m() {
        this.q();
        this.a(this.a(false, (d)null).b());
        this.r();
        this.l();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a() {
        this.b(true, true);
        this.a(true);
        if (this.n != null) {
            try {
                this.n.stop();
                this.n.close();
                this.n.removeMetaEventListener(this);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        this.f = null;
        this.n = null;
        this.o = null;
        this.q = null;
        Object object = this.v;
        synchronized (object) {
            if (this.u != null) {
                this.u.clear();
            }
            this.u = null;
        }
        if (this.w != null) {
            boolean bl2 = false;
            try {
                this.w.d();
                this.w.interrupt();
            }
            catch (Exception exception) {
                bl2 = true;
            }
            if (!bl2) {
                for (int i2 = 0; i2 < 50 && this.w.c(); ++i2) {
                    try {
                        Thread.sleep(100L);
                        continue;
                    }
                    catch (InterruptedException interruptedException) {
                        // empty catch block
                    }
                }
            }
            if (bl2 || this.w.c()) {
                this.e("MIDI fade effects thread did not die!");
                this.c("Ignoring errors... continuing clean-up.");
            }
        }
        this.w = null;
        this.b(true, false);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(d d2) {
        if (d2 == null) {
            this.e("Filename/URL not specified in method 'queueSound'");
            return;
        }
        Object object = this.v;
        synchronized (object) {
            if (this.u == null) {
                this.u = new LinkedList();
            }
            this.u.add(d2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(String string) {
        if (string == null || string.equals("")) {
            this.e("Filename not specified in method 'dequeueSound'");
            return;
        }
        Object object = this.v;
        synchronized (object) {
            if (this.u != null) {
                ListIterator listIterator = this.u.listIterator();
                while (listIterator.hasNext()) {
                    if (!((d)listIterator.next()).a().equals(string)) continue;
                    listIterator.remove();
                    break;
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(d d2, long l2) {
        if (l2 < 0L) {
            this.e("Miliseconds may not be negative in method 'fadeOut'.");
            return;
        }
        this.c = l2;
        this.d = 0L;
        this.a = 1.0f;
        this.e = System.currentTimeMillis();
        Object object = this.v;
        synchronized (object) {
            if (this.u != null) {
                this.u.clear();
            }
            if (d2 != null) {
                if (this.u == null) {
                    this.u = new LinkedList();
                }
                this.u.add(d2);
            }
        }
        if (this.w == null) {
            this.w = new k(this, null);
            this.w.start();
        }
        this.w.interrupt();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(d d2, long l2, long l3) {
        if (d2 == null) {
            this.e("Filename/URL not specified in method 'fadeOutIn'.");
            return;
        }
        if (l2 < 0L || l3 < 0L) {
            this.e("Miliseconds may not be negative in method 'fadeOutIn'.");
            return;
        }
        this.c = l2;
        this.d = l3;
        this.a = 1.0f;
        this.e = System.currentTimeMillis();
        Object object = this.v;
        synchronized (object) {
            if (this.u == null) {
                this.u = new LinkedList();
            }
            this.u.clear();
            this.u.add(d2);
        }
        if (this.w == null) {
            this.w = new k(this, null);
            this.w.start();
        }
        this.w.interrupt();
    }

    private synchronized boolean n() {
        if (this.a == -1.0f && this.b == 1.0f) {
            return false;
        }
        long l2 = System.currentTimeMillis();
        long l3 = l2 - this.e;
        this.e = l2;
        if (this.a >= 0.0f) {
            if (this.c == 0L) {
                this.a = 0.0f;
                this.b = 0.0f;
                if (!this.o()) {
                    this.c();
                }
                this.e();
                this.l();
                return false;
            }
            float f2 = (float)l3 / (float)this.c;
            this.a -= f2;
            if (this.a <= 0.0f) {
                this.a = -1.0f;
                this.b = 0.0f;
                if (!this.o()) {
                    this.c();
                }
                this.e();
                this.l();
                return false;
            }
            this.l();
            return true;
        }
        if (this.b < 1.0f) {
            this.a = -1.0f;
            if (this.d == 0L) {
                this.a = -1.0f;
                this.b = 1.0f;
            } else {
                float f3 = (float)l3 / (float)this.d;
                this.b += f3;
                if (this.b >= 1.0f) {
                    this.a = -1.0f;
                    this.b = 1.0f;
                }
            }
            this.l();
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean o() {
        Object object = this.v;
        synchronized (object) {
            if (this.u != null && this.u.size() > 0) {
                this.a(true, (d)this.u.remove(0));
                this.b(true, true);
                if (this.n == null) {
                    this.q();
                } else {
                    this.n.stop();
                    this.n.setMicrosecondPosition(0L);
                    this.n.removeMetaEventListener(this);
                    try {
                        Thread.sleep(100L);
                    }
                    catch (InterruptedException interruptedException) {
                        // empty catch block
                    }
                }
                if (this.n == null) {
                    this.e("Unable to set the sequence in method 'incrementSequence', because there wasn't a sequencer to use.");
                    this.b(true, false);
                    return false;
                }
                this.a(this.a(false, (d)null).b());
                this.n.start();
                this.l();
                this.n.addMetaEventListener(this);
                this.b(true, false);
                return true;
            }
        }
        return false;
    }

    public void b() {
        if (!this.h()) {
            if (this.n == null) {
                return;
            }
            try {
                this.n.start();
                this.n.addMetaEventListener(this);
            }
            catch (Exception exception) {
                this.e("Exception in method 'play'");
                this.a(exception);
                s s2 = new s(exception.getMessage());
                e.a.o.a(s2);
            }
        }
    }

    public void c() {
        if (!this.h()) {
            if (this.n == null) {
                return;
            }
            try {
                this.n.stop();
                this.n.setMicrosecondPosition(0L);
                this.n.removeMetaEventListener(this);
            }
            catch (Exception exception) {
                this.e("Exception in method 'stop'");
                this.a(exception);
                s s2 = new s(exception.getMessage());
                e.a.o.a(s2);
            }
        }
    }

    public void d() {
        if (!this.h()) {
            if (this.n == null) {
                return;
            }
            try {
                this.n.stop();
            }
            catch (Exception exception) {
                this.e("Exception in method 'pause'");
                this.a(exception);
                s s2 = new s(exception.getMessage());
                e.a.o.a(s2);
            }
        }
    }

    public void e() {
        if (!this.h()) {
            if (this.n == null) {
                return;
            }
            try {
                this.n.setMicrosecondPosition(0L);
            }
            catch (Exception exception) {
                this.e("Exception in method 'rewind'");
                this.a(exception);
                s s2 = new s(exception.getMessage());
                e.a.o.a(s2);
            }
        }
    }

    public void a(float f2) {
        this.s = f2;
        this.l();
    }

    public float f() {
        return this.s;
    }

    public void a(boolean bl2, String string, String string2) {
        this.b(true, true);
        this.a(true, new d(string2));
        this.b(true, string);
        this.a(bl2);
        this.p();
        this.b(true, false);
    }

    public void a(boolean bl2, String string, URL uRL, String string2) {
        this.b(true, true);
        this.a(true, new d(uRL, string2));
        this.b(true, string);
        this.a(bl2);
        this.p();
        this.b(true, false);
    }

    public void a(boolean bl2, String string, d d2) {
        this.b(true, true);
        this.a(true, d2);
        this.b(true, string);
        this.a(bl2);
        this.p();
        this.b(true, false);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void p() {
        Object object = this.v;
        synchronized (object) {
            if (this.u != null) {
                this.u.clear();
            }
        }
        if (this.n == null) {
            this.q();
        } else {
            this.n.stop();
            this.n.setMicrosecondPosition(0L);
            this.n.removeMetaEventListener(this);
            try {
                Thread.sleep(100L);
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
        }
        if (this.n == null) {
            this.e("Unable to set the sequence in method 'reset', because there wasn't a sequencer to use.");
            return;
        }
        this.a(this.a(false, (d)null).b());
        this.n.start();
        this.l();
        this.n.addMetaEventListener(this);
    }

    public void a(boolean bl2) {
        this.a(true, bl2);
    }

    public boolean g() {
        return this.a(false, false);
    }

    private synchronized boolean a(boolean bl2, boolean bl3) {
        if (bl2) {
            this.r = bl3;
        }
        return this.r;
    }

    public boolean h() {
        return this.b(false, false);
    }

    private synchronized boolean b(boolean bl2, boolean bl3) {
        if (bl2) {
            this.t = bl3;
        }
        return this.t;
    }

    public void b(String string) {
        this.b(true, string);
    }

    public String i() {
        return this.b(false, null);
    }

    private synchronized String b(boolean bl2, String string) {
        if (bl2) {
            this.h = string;
        }
        return this.h;
    }

    public void b(d d2) {
        this.a(true, d2);
    }

    public String j() {
        return this.a(false, (d)null).a();
    }

    public d k() {
        return this.a(false, (d)null);
    }

    private synchronized d a(boolean bl2, d d2) {
        if (bl2) {
            this.g = d2;
        }
        return this.g;
    }

    public void meta(MetaMessage metaMessage) {
        if (metaMessage.getType() == 47) {
            e.a.p.a(this.h, this.u.size());
            if (this.r) {
                if (!this.n()) {
                    if (!this.o()) {
                        try {
                            this.n.setMicrosecondPosition(0L);
                            this.n.start();
                            this.l();
                        }
                        catch (Exception exception) {}
                    }
                } else if (this.n != null) {
                    try {
                        this.n.setMicrosecondPosition(0L);
                        this.n.start();
                        this.l();
                    }
                    catch (Exception exception) {}
                }
            } else if (!this.n()) {
                if (!this.o()) {
                    try {
                        this.n.stop();
                        this.n.setMicrosecondPosition(0L);
                        this.n.removeMetaEventListener(this);
                    }
                    catch (Exception exception) {}
                }
            } else {
                try {
                    this.n.stop();
                    this.n.setMicrosecondPosition(0L);
                    this.n.removeMetaEventListener(this);
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
        }
    }

    public void l() {
        if (this.s < 0.0f) {
            this.s = 0.0f;
        }
        if (this.s > 1.0f) {
            this.s = 1.0f;
        }
        int n2 = (int)(this.s * e.a.p.e() * Math.abs(this.a) * this.b * 127.0f);
        if (this.o != null) {
            MidiChannel[] arrmidiChannel = this.o.getChannels();
            for (int i2 = 0; arrmidiChannel != null && i2 < arrmidiChannel.length; ++i2) {
                arrmidiChannel[i2].controlChange(7, n2);
            }
        } else if (this.p != null) {
            try {
                ShortMessage shortMessage = new ShortMessage();
                for (int i3 = 0; i3 < 16; ++i3) {
                    shortMessage.setMessage(176, i3, 7, n2);
                    this.p.getReceiver().send(shortMessage, -1L);
                }
            }
            catch (Exception exception) {
                this.e("Error resetting gain on MIDI device");
                this.a(exception);
            }
        } else if (this.n != null && this.n instanceof Synthesizer) {
            this.o = (Synthesizer)((Object)this.n);
            MidiChannel[] arrmidiChannel = this.o.getChannels();
            for (int i4 = 0; arrmidiChannel != null && i4 < arrmidiChannel.length; ++i4) {
                arrmidiChannel[i4].controlChange(7, n2);
            }
        } else {
            try {
                Receiver receiver = MidiSystem.getReceiver();
                ShortMessage shortMessage = new ShortMessage();
                for (int i5 = 0; i5 < 16; ++i5) {
                    shortMessage.setMessage(176, i5, 7, n2);
                    receiver.send(shortMessage, -1L);
                }
            }
            catch (Exception exception) {
                this.e("Error resetting gain on default receiver");
                this.a(exception);
            }
        }
    }

    private void q() {
        block14: {
            try {
                this.n = MidiSystem.getSequencer();
                if (this.n == null) break block14;
                try {
                    this.n.getTransmitter();
                }
                catch (MidiUnavailableException midiUnavailableException) {
                    this.c("Unable to get a transmitter from the default MIDI sequencer");
                }
                this.n.open();
            }
            catch (MidiUnavailableException midiUnavailableException) {
                this.c("Unable to open the default MIDI sequencer");
                this.n = null;
            }
            catch (Exception exception) {
                if (exception instanceof InterruptedException) {
                    this.c("Caught InterruptedException while attempting to open the default MIDI sequencer.  Trying again.");
                    this.n = null;
                }
                try {
                    this.n = MidiSystem.getSequencer();
                    if (this.n == null) break block14;
                    try {
                        this.n.getTransmitter();
                    }
                    catch (MidiUnavailableException midiUnavailableException) {
                        this.c("Unable to get a transmitter from the default MIDI sequencer");
                    }
                    this.n.open();
                }
                catch (MidiUnavailableException midiUnavailableException) {
                    this.c("Unable to open the default MIDI sequencer");
                    this.n = null;
                }
                catch (Exception exception2) {
                    this.c("Unknown error opening the default MIDI sequencer");
                    this.n = null;
                }
            }
        }
        if (this.n == null) {
            this.n = this.f("Real Time Sequencer");
        }
        if (this.n == null) {
            this.n = this.f("Java Sound Sequencer");
        }
        if (this.n == null) {
            this.e("Failed to find an available MIDI sequencer");
            return;
        }
    }

    private void a(URL uRL) {
        if (this.n == null) {
            this.e("Unable to update the sequence in method 'setSequence', because variable 'sequencer' is null");
            return;
        }
        if (uRL == null) {
            this.e("Unable to load Midi file in method 'setSequence'.");
            return;
        }
        try {
            this.q = MidiSystem.getSequence(uRL);
        }
        catch (IOException iOException) {
            this.e("Input failed while reading from MIDI file in method 'setSequence'.");
            this.a(iOException);
            return;
        }
        catch (InvalidMidiDataException invalidMidiDataException) {
            this.e("Invalid MIDI data encountered, or not a MIDI file in method 'setSequence' (1).");
            this.a(invalidMidiDataException);
            return;
        }
        if (this.q == null) {
            this.e("MidiSystem 'getSequence' method returned null in method 'setSequence'.");
        } else {
            try {
                this.n.setSequence(this.q);
            }
            catch (InvalidMidiDataException invalidMidiDataException) {
                this.e("Invalid MIDI data encountered, or not a MIDI file in method 'setSequence' (2).");
                this.a(invalidMidiDataException);
                return;
            }
            catch (Exception exception) {
                this.e("Problem setting sequence from MIDI file in method 'setSequence'.");
                this.a(exception);
                return;
            }
        }
    }

    private void r() {
        if (this.n == null) {
            this.e("Unable to load a Synthesizer in method 'getSynthesizer', because variable 'sequencer' is null");
            return;
        }
        String string = e.a.p.q();
        if (string != null && !string.equals("")) {
            this.p = this.g(string);
            if (this.p != null) {
                try {
                    this.n.getTransmitter().setReceiver(this.p.getReceiver());
                    return;
                }
                catch (MidiUnavailableException midiUnavailableException) {
                    this.e("Unable to link sequencer transmitter with receiver for MIDI device '" + string + "'");
                }
            }
        }
        if (this.n instanceof Synthesizer) {
            this.o = (Synthesizer)((Object)this.n);
        } else {
            try {
                this.o = MidiSystem.getSynthesizer();
                this.o.open();
            }
            catch (MidiUnavailableException midiUnavailableException) {
                this.c("Unable to open the default synthesizer");
                this.o = null;
            }
            if (this.o == null) {
                this.p = this.g("Java Sound Synthesizer");
                if (this.p == null) {
                    this.p = this.g("Microsoft GS Wavetable");
                }
                if (this.p == null) {
                    this.p = this.g("Gervill");
                }
                if (this.p == null) {
                    this.e("Failed to find an available MIDI synthesizer");
                    return;
                }
            }
            if (this.o == null) {
                try {
                    this.n.getTransmitter().setReceiver(this.p.getReceiver());
                }
                catch (MidiUnavailableException midiUnavailableException) {
                    this.e("Unable to link sequencer transmitter with MIDI device receiver");
                }
            } else if (this.o.getDefaultSoundbank() == null) {
                try {
                    this.n.getTransmitter().setReceiver(MidiSystem.getReceiver());
                }
                catch (MidiUnavailableException midiUnavailableException) {
                    this.e("Unable to link sequencer transmitter with default receiver");
                }
            } else {
                try {
                    this.n.getTransmitter().setReceiver(this.o.getReceiver());
                }
                catch (MidiUnavailableException midiUnavailableException) {
                    this.e("Unable to link sequencer transmitter with synthesizer receiver");
                }
            }
        }
    }

    private Sequencer f(String string) {
        Sequencer sequencer = null;
        sequencer = (Sequencer)this.g(string);
        if (sequencer == null) {
            return null;
        }
        try {
            sequencer.getTransmitter();
        }
        catch (MidiUnavailableException midiUnavailableException) {
            this.c("    Unable to get a transmitter from this sequencer");
            sequencer = null;
            return null;
        }
        return sequencer;
    }

    private MidiDevice g(String string) {
        this.c("Searching for MIDI device with name containing '" + string + "'");
        MidiDevice midiDevice = null;
        MidiDevice.Info[] arrinfo = MidiSystem.getMidiDeviceInfo();
        for (int i2 = 0; i2 < arrinfo.length; ++i2) {
            midiDevice = null;
            try {
                midiDevice = MidiSystem.getMidiDevice(arrinfo[i2]);
            }
            catch (MidiUnavailableException midiUnavailableException) {
                this.c("    Problem in method 'getMidiDevice':  MIDIUnavailableException was thrown");
                midiDevice = null;
            }
            if (midiDevice == null || !arrinfo[i2].getName().contains(string)) continue;
            this.c("    Found MIDI device named '" + arrinfo[i2].getName() + "'");
            if (midiDevice instanceof Synthesizer) {
                this.c("        *this is a Synthesizer instance");
            }
            if (midiDevice instanceof Sequencer) {
                this.c("        *this is a Sequencer instance");
            }
            try {
                midiDevice.open();
            }
            catch (MidiUnavailableException midiUnavailableException) {
                this.c("    Unable to open this MIDI device");
                midiDevice = null;
            }
            return midiDevice;
        }
        this.c("    MIDI device not found");
        return null;
    }

    protected void c(String string) {
        this.f.a(string, 0);
    }

    protected void d(String string) {
        this.f.b(string, 0);
    }

    protected boolean a(boolean bl2, String string) {
        return this.f.a(bl2, "MidiChannel", string, 0);
    }

    protected void e(String string) {
        this.f.a("MidiChannel", string, 0);
    }

    protected void a(Exception exception) {
        this.f.a(exception, 1);
    }

    static /* synthetic */ boolean a(i i2) {
        return i2.n();
    }
}

