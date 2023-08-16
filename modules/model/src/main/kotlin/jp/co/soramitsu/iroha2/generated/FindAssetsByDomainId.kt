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
 * FindAssetsByDomainId
 *
 * Generated from 'FindAssetsByDomainId' regular structure
 */
public data class FindAssetsByDomainId(
    public val domainId: EvaluatesTo<DomainId>,
) {
    public companion object : ScaleReader<FindAssetsByDomainId>, ScaleWriter<FindAssetsByDomainId> {
        override fun read(reader: ScaleCodecReader): FindAssetsByDomainId = try {
            FindAssetsByDomainId(
                EvaluatesTo.read(reader) as EvaluatesTo<DomainId>,
            )
        } catch (ex: Exception) {
            throw wrapException(ex)
        }

        override fun write(writer: ScaleCodecWriter, instance: FindAssetsByDomainId): Unit = try {
            EvaluatesTo.write(writer, instance.domainId)
        } catch (ex: Exception) {
            throw wrapException(ex)
        }
    }
}
