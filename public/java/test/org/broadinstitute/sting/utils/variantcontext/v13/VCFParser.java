package org.broadinstitute.sting.utils.variantcontext.v13;

import java.util.List;
import java.util.Map;


/**
 * All VCF codecs need to implement this interface so that we can perform lazy loading.
 */
interface VCFParser {

    /**
     * create a genotype map
     * @param str the string
     * @param alleles the list of alleles
     * @param chr chrom
     * @param pos position
     * @return a mapping of sample name to genotype object
     */
    public Map<String, Genotype> createGenotypeMap(String str, List<Allele> alleles, String chr, int pos);

}
