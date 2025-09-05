package pt.saipar.client.api.wrapper.utils.buffer;

public interface PacketBufferWrapper {

    void writeBoolean(final boolean value);

    void writeByte(final byte value);

    void writeChar(final char value);

    void writeShort(final short value);

    void writeInt(final int value);

    void writeLong(final long value);

    void writeFloat(final float value);

    void writeDouble(final double value);

    void writeString(final String value);

    boolean readBoolean();

    byte readByte();

    char readChar();

    short readShort();

    int readInt();

    long readLong();

    float readFloat();

    double readDouble();

    String readString(final int length);

    PacketBufferWrapper copy();

    Object unwrap();

}
