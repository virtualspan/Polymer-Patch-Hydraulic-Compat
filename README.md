# Polymer Patch Hydraulic Compat
Allows Polymer Patch Mods to work alongside with Hydraulic as seamlessly as without them.

## How it works
Normally, using a mod like Farmer’s Delight with Hydraulic works as expected. However, when you add a Polymer Patch mod (for example, Farmer’s Delight + Farmer’s Delight Polymer Patch), Polymer interferes with Hydraulic by disguising items and blocks, which works with a custom texture for Java players, but it leaves Bedrock players with vanilla placeholders such as a Trial Key or invisible blocks as these custom textures don't work on Bedrock.

This compat mod intercepts Polymer’s disguises and allows Polymer Patch mods to work seamlessly alongside Hydraulic. For Bedrock players connecting through Geyser/Floodgate, it sends the original item or block instead of the disguised version.

In practice, this means that `Farmer’s Delight + Hydraulic` works just as smoothly as `Farmer’s Delight + Farmer’s Delight Polymer Patch + Hydraulic`.

## Compatibility

Polymer mods with custom entities are not supported as they are yet to be supported in Hydraulic. Other than that, there hasn't been enough testing to make a list (except Farmer's Delight as it used in testing). But you should be able to expect that if `X + Hydraulic` works, that `This Mod + X + X Polymer Patch + Hydraulic` should also work.

## Bonus

If you want a (very buggy!) proof of concept, you can use this mod alongside the [Polymania](https://modrinth.com/modpack/polymania) modpack given that you remove and add the mods below:

**Add:**
- [Geyser Custom Item API V2 + Hydraulic](https://geysermc.org/download/?project=other-projects&hydraulic=expanded)
- [Floodgate](https://modrinth.com/mod/floodgate/versions?l=fabric)
- [Polymer Patch Hydraulic Compat (this mod)](https://github.com/virtualspan/Polymer-Patch-Hydraulic-Compat/releases/tag/1.0)

**Remove:**
- Dungeons and Tarverns
- ForgeConfigAPIPort
- Leaves Us In Peace
- PolyFactory
