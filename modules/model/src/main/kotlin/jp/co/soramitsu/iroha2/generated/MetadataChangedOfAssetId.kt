//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated

import jp.co.soramitsu.iroha2.codec.ScaleCodecReader
import jp.co.soramitsu.iroha2.codec.ScaleCodecWriter
import jp.co.soramitsu.iroha2.codec.ScaleReader
import jp.co.soramitsu.iroha2.codec.ScaleWriter
import jp.co.soramitsu.iroha2.wrapException
import kotlin.Unit

/**
 * MetadataChangedOfAssetId
 *
 * Generated from 'MetadataChangedOfAssetId' regular structure
 */
public data class MetadataChangedOfAssetId(
    public val targetId: AssetId,
    public val key: Name,
    public val `value`: MetadataValueBox,
) {
    public companion object :
        ScaleReader<MetadataChangedOfAssetId>,
        ScaleWriter<MetadataChangedOfAssetId> {
        override fun read(reader: ScaleCodecReader): MetadataChangedOfAssetId = try {
            MetadataChangedOfAssetId(
                AssetId.read(reader),
                Name.read(reader),
                MetadataValueBox.read(reader),
            )
        } catch (ex: Exception) {
            throw wrapException(ex)
        }

        override fun write(writer: ScaleCodecWriter, instance: MetadataChangedOfAssetId): Unit = try {
            AssetId.write(writer, instance.targetId)
            Name.write(writer, instance.key)
            MetadataValueBox.write(writer, instance.`value`)
        } catch (ex: Exception) {
            throw wrapException(ex)
        }
    }
}
