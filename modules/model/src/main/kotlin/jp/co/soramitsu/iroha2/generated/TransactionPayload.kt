//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated

import jp.co.soramitsu.iroha2.codec.ScaleCodecReader
import jp.co.soramitsu.iroha2.codec.ScaleCodecWriter
import jp.co.soramitsu.iroha2.codec.ScaleReader
import jp.co.soramitsu.iroha2.codec.ScaleWriter
import jp.co.soramitsu.iroha2.comparator
import jp.co.soramitsu.iroha2.wrapException
import java.math.BigInteger
import kotlin.Unit
import kotlin.collections.Map

/**
 * TransactionPayload
 *
 * Generated from 'TransactionPayload' regular structure
 */
public data class TransactionPayload(
    public val chainId: ChainId,
    public val authority: AccountId,
    public val creationTimeMs: BigInteger,
    public val instructions: Executable,
    public val timeToLiveMs: NonZeroOfu64? = null,
    public val nonce: NonZeroOfu32? = null,
    public val metadata: Map<Name, MetadataValueBox>,
) {
    public companion object : ScaleReader<TransactionPayload>, ScaleWriter<TransactionPayload> {
        override fun read(reader: ScaleCodecReader): TransactionPayload = try {
            TransactionPayload(
                ChainId.read(reader),
                AccountId.read(reader),
                reader.readUint64(),
                Executable.read(reader),
                reader.readNullable(NonZeroOfu64) as NonZeroOfu64?,
                reader.readNullable(NonZeroOfu32) as NonZeroOfu32?,
                reader.readMap(
                    reader.readCompactInt(),
                    { Name.read(reader) },
                    { MetadataValueBox.read(reader) },
                ),
            )
        } catch (ex: Exception) {
            throw wrapException(ex)
        }

        override fun write(writer: ScaleCodecWriter, instance: TransactionPayload): Unit = try {
            ChainId.write(writer, instance.chainId)
            AccountId.write(writer, instance.authority)
            writer.writeUint64(instance.creationTimeMs)
            Executable.write(writer, instance.instructions)
            writer.writeNullable(NonZeroOfu64, instance.timeToLiveMs)
            writer.writeNullable(NonZeroOfu32, instance.nonce)
            writer.writeCompact(instance.metadata.size)
            instance.metadata.toSortedMap(
                Name.comparator(),
            ).forEach { (key, value) ->
                Name.write(writer, key)
                MetadataValueBox.write(writer, value)
            }
        } catch (ex: Exception) {
            throw wrapException(ex)
        }
    }
}
