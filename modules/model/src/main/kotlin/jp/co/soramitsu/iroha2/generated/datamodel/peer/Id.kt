//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated.datamodel.peer

import io.emeraldpay.polkaj.scale.ScaleCodecReader
import io.emeraldpay.polkaj.scale.ScaleCodecWriter
import io.emeraldpay.polkaj.scale.ScaleReader
import io.emeraldpay.polkaj.scale.ScaleWriter
import jp.co.soramitsu.iroha2.generated.crypto.PublicKey
import jp.co.soramitsu.iroha2.wrapException
import kotlin.String

/**
 * Id
 *
 * Generated from 'iroha_data_model::peer::Id' regular structure
 */
public data class Id(
    public val address: String,
    public val publicKey: PublicKey
) {
    public companion object : ScaleReader<Id>, ScaleWriter<Id> {
        public override fun read(reader: ScaleCodecReader): Id = try {
            Id(
                reader.readString(),
                PublicKey.read(reader),
            )
        } catch (ex: Exception) {
            throw wrapException(ex)
        }

        public override fun write(writer: ScaleCodecWriter, instance: Id) = try {
            writer.writeAsList(instance.address.toByteArray(Charsets.UTF_8))
            PublicKey.write(writer, instance.publicKey)
        } catch (ex: Exception) {
            throw wrapException(ex)
        }
    }
}