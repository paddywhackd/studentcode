
/**
 * Into to JavaScript
 */
function variables() {

    const doesNotChange = 42;
    // doesNotChange = 0;

    let thisCanChange = 0;
    thisCanChange = 100;

    let thisIsAString = "hello world";
    let thisIsAnotherString = 'hello world';
    console.log(thisIsAnotherString);

    console.log(`the value of thisIsAString is $(thisIsAString)`);

    const weekdays = [
        "monday", "tuesday", "wednesday", "thursday", "friday"
    ];

    console.table({ weekdays });

    function canDoMath() {
        console.log(2 + 2);
        console.log("Hello " + "World");
        console.log(typeof ("2" + 2));
    }
}

function hasObjects() {

    const person = {
        firstName: "mike",
        lastName: "levy",
        address: {
            street: "1776 mentor"
        },
        children: [
            "megan", "jacob"
        ]
    }
    person.lastName = "smith";


    function add(x, y) {
        return x + y;
    }
    function add(x, y, z) {
        return x + y + z;
    }

    function mathObject() {
        console.log(Math.PI)

    }

}