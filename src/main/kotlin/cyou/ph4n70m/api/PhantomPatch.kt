package cyou.ph4n70m.api

interface PhantomPatch {

    /*
     *  This method will be called when the patch is applied.
     * You can use this method to modify the original state.
     */
    fun onPatch()

    /*
     *  This method will be called when the patch is removed.
     * You can use this method to restore the original state.
     */
    fun onReversePatch() {}

}