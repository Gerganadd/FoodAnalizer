package bg.sofia.uni.fmi.mjt.exceptions;

public class ExceptionMessages {
    public static final String UNKNOWN_COMMAND_TYPE = "Server doesn't support command: ";
    public static final String INVALID_COMMAND_ATTRIBUTES = "Invalid command attributes.";
    public static final String COMMAND_NULL_OR_BLANK = "Command can't be null or blank";

    public static final String IMAGE_PATH_NULL_OR_BLANK = "Image path can't be null or blank";
    public static final String IMAGE_PATH_DOES_NOT_EXIST = "Couldn't find image with path: ";
    public static final String IMAGE_DOES_NOT_CONTAINS_CODE = "There is problem with parsing the code from the image ";

    public static final String PRODUCT_NAME_NULL_OR_BLANK = "Product name can't be null or blank";
    public static final String PRODUCT_NAME_DESCRIPTION = "Product name must contains only words separated by space"; //? requirement

    public static final String CODE_NULL_OR_BLANK = " code can't be null or blank";
    public static final String CODE_REQUIREMENTS = " code must contains only digits"; //?

    public static final String GTIN_UPC_CODE_DOES_NOT_CONTAINS = "Api does not contain information about gtinUpc code=";
    public static final String FCD_ID_DOES_NOT_CONTAINS = "Api does not contain information about fcdId code=";
    public static final String FOOD_NAME_DOES_NOT_CONTAINS = "Api does not contain information about ";

    public static final String PROBLEM_WITH_CLOSING_THE_SERVER = "Problem occurred while closing the server";
    public static final String PROBLEM_WITH_STARTING_THE_SERVER = "Problem occurred while starting the server";


    public static final String GET_FOOD_COMMAND_DESCRIPTION =
            "get-food <name> - name must contains only words";
    public static final String GET_FOOD_REPORT_COMMAND_DESCRIPTION =
            "get-food-report <fsdId> - fsdId must contains only digits";
    public static final String GET_FOOD_BY_BARCODE_COMMAND_DESCRIPTION =
            "get-food-by-barcode --img=<imagePath> --code=<gtinUpc> " +
                    "- imagePath must be valid image path, gtinUpc must contains only digits";
}