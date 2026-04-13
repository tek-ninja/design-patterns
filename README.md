<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">

</head>
<body>

<h2>Singleton Approaches Comparison</h2>

<table>
    <thead>
        <tr>
            <th>Approach</th>
            <th>Thread Safe</th>
            <th>Lazy Initialization</th>
            <th>Performance</th>
            <th>Complexity</th>
            <th>Issues / Notes</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>Eager Initialization</td>
            <td>Yes</td>
            <td>No</td>
            <td>High</td>
            <td>Simple</td>
            <td>Instance created even if not used</td>
        </tr>
        <tr>
            <td>Static Block Initialization</td>
            <td>Yes</td>
            <td>No</td>
            <td>High</td>
            <td>Medium</td>
            <td>Can handle exceptions during initialization</td>
        </tr>
        <tr>
            <td>Synchronized Method</td>
            <td>Yes</td>
            <td>Yes</td>
            <td>Low</td>
            <td>Simple</td>
            <td>Performance overhead due to synchronization</td>
        </tr>
        <tr>
            <td>Synchronized Block</td>
            <td>Yes</td>
            <td>Yes</td>
            <td>Medium</td>
            <td>Medium</td>
            <td>Better than method sync but still overhead</td>
        </tr>
        <tr>
            <td>Double-Checked Locking (DCL)</td>
            <td>Yes (with volatile)</td>
            <td>Yes</td>
            <td>High</td>
            <td>Complex</td>
            <td>Tricky due to instruction reordering</td>
        </tr>
        <tr>
            <td>Bill Pugh (Inner Static Class)</td>
            <td>Yes</td>
            <td>Yes</td>
            <td>High</td>
            <td>Simple</td>
            <td>Best balance of performance and simplicity</td>
        </tr>
        <tr>
            <td>Enum Singleton</td>
            <td>Yes</td>
            <td>No</td>
            <td>High</td>
            <td>Very Simple</td>
            <td>Safe against serialization and reflection</td>
        </tr>
    </tbody>
</table>

</body>
</html>
