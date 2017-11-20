/**
 * 
 */
package netty.test2;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.ByteBufProcessor;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;

import tools.RandomTool;
import netty.ToString;

/**
 * @author wangyu
 *
 */
public class test {
	public static void main(String[] args) {
		ByteBuf buffer = new ByteBuf() {
			
			@Override
			public boolean release(int decrement) {
				return false;
			}
			
			@Override
			public boolean release() {
				return false;
			}
			
			@Override
			public int refCnt() {
				return 0;
			}
			
			@Override
			public ByteBuf writerIndex(int writerIndex) {
				return null;
			}
			
			@Override
			public int writerIndex() {
				return 0;
			}
			
			@Override
			public ByteBuf writeZero(int length) {
				return null;
			}
			
			@Override
			public ByteBuf writeShort(int value) {
				return null;
			}
			
			@Override
			public ByteBuf writeMedium(int value) {
				return null;
			}
			
			@Override
			public ByteBuf writeLong(long value) {
				return null;
			}
			
			@Override
			public ByteBuf writeInt(int value) {
				return null;
			}
			
			@Override
			public ByteBuf writeFloat(float value) {
				return null;
			}
			
			@Override
			public ByteBuf writeDouble(double value) {
				return null;
			}
			
			@Override
			public ByteBuf writeChar(int value) {
				return null;
			}
			
			@Override
			public ByteBuf writeBytes(byte[] src, int srcIndex, int length) {
				return null;
			}
			
			@Override
			public ByteBuf writeBytes(ByteBuf src, int srcIndex, int length) {
				return null;
			}
			
			@Override
			public int writeBytes(ScatteringByteChannel in, int length)
					throws IOException {
				return 0;
			}
			
			@Override
			public int writeBytes(InputStream in, int length) throws IOException {
				return 0;
			}
			
			@Override
			public ByteBuf writeBytes(ByteBuf src, int length) {
				return null;
			}
			
			@Override
			public ByteBuf writeBytes(ByteBuffer src) {
				return null;
			}
			
			@Override
			public ByteBuf writeBytes(byte[] src) {
				return null;
			}
			
			@Override
			public ByteBuf writeBytes(ByteBuf src) {
				return null;
			}
			
			@Override
			public ByteBuf writeByte(int value) {
				return null;
			}
			
			@Override
			public ByteBuf writeBoolean(boolean value) {
				return null;
			}
			
			@Override
			public int writableBytes() {
				return 0;
			}
			
			@Override
			public ByteBuf unwrap() {
				return null;
			}
			
			@Override
			public String toString(int index, int length, Charset charset) {
				return null;
			}
			
			@Override
			public String toString(Charset charset) {
				return null;
			}
			
			@Override
			public String toString() {
				return null;
			}
			
			@Override
			public ByteBuf slice(int index, int length) {
				return null;
			}
			
			@Override
			public ByteBuf slice() {
				return null;
			}
			
			@Override
			public ByteBuf skipBytes(int length) {
				return null;
			}
			
			@Override
			public ByteBuf setZero(int index, int length) {
				return null;
			}
			
			@Override
			public ByteBuf setShort(int index, int value) {
				return null;
			}
			
			@Override
			public ByteBuf setMedium(int index, int value) {
				return null;
			}
			
			@Override
			public ByteBuf setLong(int index, long value) {
				return null;
			}
			
			@Override
			public ByteBuf setInt(int index, int value) {
				return null;
			}
			
			@Override
			public ByteBuf setIndex(int readerIndex, int writerIndex) {
				return null;
			}
			
			@Override
			public ByteBuf setFloat(int index, float value) {
				return null;
			}
			
			@Override
			public ByteBuf setDouble(int index, double value) {
				return null;
			}
			
			@Override
			public ByteBuf setChar(int index, int value) {
				return null;
			}
			
			@Override
			public ByteBuf setBytes(int index, byte[] src, int srcIndex, int length) {
				return null;
			}
			
			@Override
			public ByteBuf setBytes(int index, ByteBuf src, int srcIndex, int length) {
				return null;
			}
			
			@Override
			public int setBytes(int index, ScatteringByteChannel in, int length)
					throws IOException {
				return 0;
			}
			
			@Override
			public int setBytes(int index, InputStream in, int length)
					throws IOException {
				return 0;
			}
			
			@Override
			public ByteBuf setBytes(int index, ByteBuf src, int length) {
				return null;
			}
			
			@Override
			public ByteBuf setBytes(int index, ByteBuffer src) {
				return null;
			}
			
			@Override
			public ByteBuf setBytes(int index, byte[] src) {
				return null;
			}
			
			@Override
			public ByteBuf setBytes(int index, ByteBuf src) {
				return null;
			}
			
			@Override
			public ByteBuf setByte(int index, int value) {
				return null;
			}
			
			@Override
			public ByteBuf setBoolean(int index, boolean value) {
				return null;
			}
			
			@Override
			public ByteBuf retain(int increment) {
				return null;
			}
			
			@Override
			public ByteBuf retain() {
				return null;
			}
			
			@Override
			public ByteBuf resetWriterIndex() {
				return null;
			}
			
			@Override
			public ByteBuf resetReaderIndex() {
				return null;
			}
			
			@Override
			public ByteBuf readerIndex(int readerIndex) {
				return null;
			}
			
			@Override
			public int readerIndex() {
				return 0;
			}
			
			@Override
			public int readableBytes() {
				return 0;
			}
			
			@Override
			public int readUnsignedShort() {
				return 0;
			}
			
			@Override
			public int readUnsignedMedium() {
				return 0;
			}
			
			@Override
			public long readUnsignedInt() {
				return 0;
			}
			
			@Override
			public short readUnsignedByte() {
				return 0;
			}
			
			@Override
			public ByteBuf readSlice(int length) {
				return null;
			}
			
			@Override
			public short readShort() {
				return 0;
			}
			
			@Override
			public int readMedium() {
				return 0;
			}
			
			@Override
			public long readLong() {
				return 0;
			}
			
			@Override
			public int readInt() {
				return 0;
			}
			
			@Override
			public float readFloat() {
				return 0;
			}
			
			@Override
			public double readDouble() {
				return 0;
			}
			
			@Override
			public char readChar() {
				return 0;
			}
			
			@Override
			public ByteBuf readBytes(byte[] dst, int dstIndex, int length) {
				return null;
			}
			
			@Override
			public ByteBuf readBytes(ByteBuf dst, int dstIndex, int length) {
				return null;
			}
			
			@Override
			public int readBytes(GatheringByteChannel out, int length)
					throws IOException {
				return 0;
			}
			
			@Override
			public ByteBuf readBytes(OutputStream out, int length) throws IOException {
				return null;
			}
			
			@Override
			public ByteBuf readBytes(ByteBuf dst, int length) {
				return null;
			}
			
			@Override
			public ByteBuf readBytes(ByteBuffer dst) {
				return null;
			}
			
			@Override
			public ByteBuf readBytes(byte[] dst) {
				return null;
			}
			
			@Override
			public ByteBuf readBytes(ByteBuf dst) {
				return null;
			}
			
			@Override
			public ByteBuf readBytes(int length) {
				return null;
			}
			
			@Override
			public byte readByte() {
				return 0;
			}
			
			@Override
			public boolean readBoolean() {
				return false;
			}
			
			@Override
			public ByteBuf order(ByteOrder endianness) {
				return null;
			}
			
			@Override
			public ByteOrder order() {
				return null;
			}
			
			@Override
			public ByteBuffer[] nioBuffers(int index, int length) {
				return null;
			}
			
			@Override
			public ByteBuffer[] nioBuffers() {
				return null;
			}
			
			@Override
			public int nioBufferCount() {
				return 0;
			}
			
			@Override
			public ByteBuffer nioBuffer(int index, int length) {
				return null;
			}
			
			@Override
			public ByteBuffer nioBuffer() {
				return null;
			}
			
			@Override
			public long memoryAddress() {
				return 0;
			}
			
			@Override
			public int maxWritableBytes() {
				return 0;
			}
			
			@Override
			public int maxCapacity() {
				return 0;
			}
			
			@Override
			public ByteBuf markWriterIndex() {
				return null;
			}
			
			@Override
			public ByteBuf markReaderIndex() {
				return null;
			}
			
			@Override
			public boolean isWritable(int size) {
				return false;
			}
			
			@Override
			public boolean isWritable() {
				return false;
			}
			
			@Override
			public boolean isReadable(int size) {
				return false;
			}
			
			@Override
			public boolean isReadable() {
				return false;
			}
			
			@Override
			public boolean isDirect() {
				return false;
			}
			
			@Override
			public ByteBuffer internalNioBuffer(int index, int length) {
				return null;
			}
			
			@Override
			public int indexOf(int fromIndex, int toIndex, byte value) {
				return 0;
			}
			
			@Override
			public int hashCode() {
				return 0;
			}
			
			@Override
			public boolean hasMemoryAddress() {
				return false;
			}
			
			@Override
			public boolean hasArray() {
				return false;
			}
			
			@Override
			public int getUnsignedShort(int index) {
				return 0;
			}
			
			@Override
			public int getUnsignedMedium(int index) {
				return 0;
			}
			
			@Override
			public long getUnsignedInt(int index) {
				return 0;
			}
			
			@Override
			public short getUnsignedByte(int index) {
				return 0;
			}
			
			@Override
			public short getShort(int index) {
				return 0;
			}
			
			@Override
			public int getMedium(int index) {
				return 0;
			}
			
			@Override
			public long getLong(int index) {
				return 0;
			}
			
			@Override
			public int getInt(int index) {
				return 0;
			}
			
			@Override
			public float getFloat(int index) {
				return 0;
			}
			
			@Override
			public double getDouble(int index) {
				return 0;
			}
			
			@Override
			public char getChar(int index) {
				return 0;
			}
			
			@Override
			public ByteBuf getBytes(int index, byte[] dst, int dstIndex, int length) {
				return null;
			}
			
			@Override
			public ByteBuf getBytes(int index, ByteBuf dst, int dstIndex, int length) {
				return null;
			}
			
			@Override
			public int getBytes(int index, GatheringByteChannel out, int length)
					throws IOException {
				return 0;
			}
			
			@Override
			public ByteBuf getBytes(int index, OutputStream out, int length)
					throws IOException {
				return null;
			}
			
			@Override
			public ByteBuf getBytes(int index, ByteBuf dst, int length) {
				return null;
			}
			
			@Override
			public ByteBuf getBytes(int index, ByteBuffer dst) {
				return null;
			}
			
			@Override
			public ByteBuf getBytes(int index, byte[] dst) {
				return null;
			}
			
			@Override
			public ByteBuf getBytes(int index, ByteBuf dst) {
				return null;
			}
			
			@Override
			public byte getByte(int index) {
				return 0;
			}
			
			@Override
			public boolean getBoolean(int index) {
				return false;
			}
			
			@Override
			public int forEachByteDesc(int index, int length, ByteBufProcessor processor) {
				return 0;
			}
			
			@Override
			public int forEachByteDesc(ByteBufProcessor processor) {
				return 0;
			}
			
			@Override
			public int forEachByte(int index, int length, ByteBufProcessor processor) {
				return 0;
			}
			
			@Override
			public int forEachByte(ByteBufProcessor processor) {
				return 0;
			}
			
			@Override
			public boolean equals(Object obj) {
				return false;
			}
			
			@Override
			public int ensureWritable(int minWritableBytes, boolean force) {
				return 0;
			}
			
			@Override
			public ByteBuf ensureWritable(int minWritableBytes) {
				return null;
			}
			
			@Override
			public ByteBuf duplicate() {
				return null;
			}
			
			@Override
			public ByteBuf discardSomeReadBytes() {
				return null;
			}
			
			@Override
			public ByteBuf discardReadBytes() {
				return null;
			}
			
			@Override
			public ByteBuf copy(int index, int length) {
				return null;
			}
			
			@Override
			public ByteBuf copy() {
				return null;
			}
			
			@Override
			public int compareTo(ByteBuf buffer) {
				return 0;
			}
			
			@Override
			public ByteBuf clear() {
				return null;
			}
			
			@Override
			public ByteBuf capacity(int newCapacity) {
				return null;
			}
			
			@Override
			public int capacity() {
				return 0;
			}
			
			@Override
			public int bytesBefore(int index, int length, byte value) {
				return 0;
			}
			
			@Override
			public int bytesBefore(int length, byte value) {
				return 0;
			}
			
			@Override
			public int bytesBefore(byte value) {
				return 0;
			}
			
			@Override
			public int arrayOffset() {
				return 0;
			}
			
			@Override
			public byte[] array() {
				return null;
			}
			
			@Override
			public ByteBufAllocator alloc() {
				return null;
			}
		} ;
		buffer.writeLong(99999999);
		buffer.writerIndex(9999);
	    while (buffer.writableBytes() >= 4) {
	        buffer.writeInt(RandomTool.random.nextInt());
	        ToString.println("--");
	    }
	}
}
